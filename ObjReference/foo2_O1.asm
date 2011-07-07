.globl __Z4Foo2PP10SomeObjectj
	.def	__Z4Foo2PP10SomeObjectj;	.scl	2;	.type	32;	.endef
__Z4Foo2PP10SomeObjectj:
	pushl	%ebp
	movl	%esp, %ebp
	pushl	%edi
	pushl	%esi
	pushl	%ebx
	subl	$4, %esp
	movl	8(%ebp), %edi
	cmpl	$0, 12(%ebp)
	je	L24
	movl	$0, %ebx
	movl	$0, %esi
L26:
	addl	(%edi), %ebx
	movl	%ebx, (%esp)
	call	__ZN10SomeObject10Operation1Ev
	movl	%ebx, (%esp)
	call	__ZN10SomeObject10Operation2Ev
	movl	%ebx, (%esp)
	call	__ZN10SomeObject10Operation3Ev
	movl	%ebx, (%esp)
	call	__ZN10SomeObject10Operation4Ev
	movl	%ebx, (%esp)
	call	__ZN10SomeObject10Operation5Ev
	movl	%ebx, (%esp)
	call	__ZN10SomeObject10Operation6Ev
	incl	%esi
	movl	%esi, %ebx
	cmpl	%esi, 12(%ebp)
	ja	L26
L24:
	addl	$4, %esp
	popl	%ebx
	popl	%esi
	popl	%edi
	leave
	ret
