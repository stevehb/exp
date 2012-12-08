// for clearing the scene
THREE.Object3D.prototype.clear = function(){
    var children = this.children;
    for(var i = children.length-1;i>=0;i--){
        var child = children[i];
        child.clear();
        this.remove(child);
    };
};

var scene, camera, renderer, stats;
var lastTime, currentTime, elapsed;
var sphereGeom, sphereMat, sphereMesh;
var redLight, redLightGeom, redLightMat, redLightMesh;
var blueLight, blueLightGeom, blueLightMat, blueLightMesh;

$(document).ready(function() {

  scene = new THREE.Scene();

  var aspectRatio = $(window).width() / $(window).height();
  camera = new THREE.PerspectiveCamera(55, aspectRatio, 1, 1000);
  camera.position.copy(new THREE.Vector3(0, 0, 100));
  camera.lookAt(new THREE.Vector3(0, 0, 0));

  renderer = new THREE.WebGLRenderer({ antialias: true });
  renderer.setSize($(window).width(), $(window).height());
  renderer.setClearColorHex(0x302010, 1.0);
  $(renderer.domElement).attr('id', 'the_canvas');
  $('#canvas_container').append(renderer.domElement);

  sphereGeom = new THREE.SphereGeometry(10, 16, 16);
  sphereMat = new THREE.MeshLambertMaterial({ color: 0xbbbbbb });
  sphereMesh = new THREE.Mesh(sphereGeom, sphereMat);
  scene.add(sphereMesh);

  redLight = new THREE.PointLight(0xff0000);
  redLight.position.set(0, 35, 0);
  scene.add(redLight);
  redLightGeom = new THREE.SphereGeometry(2, 4, 4);
  redLightMat = new THREE.MeshBasicMaterial({ color: 0xff0000 });
  redLightMesh = new THREE.Mesh(redLightGeom, redLightMat);
  redLightMesh.position.y = 35;
  scene.add(redLightMesh);

  blueLight = new THREE.PointLight(0x0000ff);
  blueLight.position.set(0, -35, 0);
  scene.add(blueLight);
  blueLightGeom = new THREE.SphereGeometry(2, 4, 4);
  blueLightMat = new THREE.MeshBasicMaterial({ color: 0x0000ff });
  blueLightMesh = new THREE.Mesh(blueLightGeom, blueLightMat);
  blueLightMesh.position.y = -35;
  scene.add(blueLightMesh);

  // handle window resizing
  $(window).resize(function(evt) {
    renderer.setSize($('#canvas_container').width(), $('#canvas_container').height());
    camera.aspect = $('#canvas_container').width() / $('#canvas_container').height();
    camera.updateProjectionMatrix();
  });

  // set up stats counter & keyboard state
  stats = new Stats();
  $('#perf_stats').append(stats.domElement);
  keyboard = new THREEx.KeyboardState();

  lastTime = Date.now();
  update();
});

var update = function() {
  currentTime = Date.now();
  elapsed = currentTime - lastTime;
  lastTime = currentTime;

  // DEBUG cam movement
  if(keyboard.pressed('w')) { camera.position.z -= 5; }
  if(keyboard.pressed('s')) { camera.position.z += 5; }
  if(keyboard.pressed('a')) { camera.position.x -= 5; }
  if(keyboard.pressed('d')) { camera.position.x += 5; }
  if(keyboard.pressed('up')) { camera.position.y += 5; }
  if(keyboard.pressed('down')) { camera.position.y -= 5; }

  var scaleMultiplier = Math.abs(Math.cos(currentTime * 0.001));
  sphereMesh.scale.set(scaleMultiplier, scaleMultiplier, scaleMultiplier);

  // update game and render
  renderer.render(scene, camera);
  stats.update();
  requestAnimationFrame(update);
};
