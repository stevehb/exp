LFE950:
.globl __Z4Foo2PP10SomeObjectj
	.def	__Z4Foo2PP10SomeObjectj;	.scl	2;	.type	32;	.endef
__Z4Foo2PP10SomeObjectj:
LFB951:
	pushl	%ebp
LCFI28:
	movl	%esp, %ebp
LCFI29:
	subl	$20, %esp
LCFI30:
	movl	$0, -4(%ebp)
	jmp	L23
L24:
	movl	8(%ebp), %eax
	movl	(%eax), %edx
	movl	-4(%ebp), %eax
	leal	(%edx,%eax), %eax
	movl	%eax, -8(%ebp)
	movl	-8(%ebp), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation1Ev
	movl	-8(%ebp), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation2Ev
	movl	-8(%ebp), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation3Ev
	movl	-8(%ebp), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation4Ev
	movl	-8(%ebp), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation5Ev
	movl	-8(%ebp), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation6Ev
	incl	-4(%ebp)
L23:
	movl	-4(%ebp), %eax
	cmpl	12(%ebp), %eax
	setb	%al
	testb	%al, %al
	jne	L24
	leave
LCFI31:
	ret
