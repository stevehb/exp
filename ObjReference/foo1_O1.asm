.globl __Z4Foo1PP10SomeObjectj
	.def	__Z4Foo1PP10SomeObjectj;	.scl	2;	.type	32;	.endef
__Z4Foo1PP10SomeObjectj:
	pushl	%ebp
	movl	%esp, %ebp
	pushl	%edi
	pushl	%esi
	pushl	%ebx
	subl	$4, %esp
	movl	8(%ebp), %ebx
	cmpl	$0, 12(%ebp)
	je	L20
	movl	$0, %esi
	movl	$0, %edi
L22:
	movl	%esi, %eax
	addl	(%ebx), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation1Ev
	movl	%esi, %eax
	addl	(%ebx), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation2Ev
	movl	%esi, %eax
	addl	(%ebx), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation3Ev
	movl	%esi, %eax
	addl	(%ebx), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation4Ev
	movl	%esi, %eax
	addl	(%ebx), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation5Ev
	addl	(%ebx), %esi
	movl	%esi, (%esp)
	call	__ZN10SomeObject10Operation6Ev
	incl	%edi
	movl	%edi, %esi
	cmpl	%edi, 12(%ebp)
	ja	L22
L20:
	addl	$4, %esp
	popl	%ebx
	popl	%esi
	popl	%edi
	leave
	ret
