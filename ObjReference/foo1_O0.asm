LFE949:
.globl __Z4Foo1PP10SomeObjectj
	.def	__Z4Foo1PP10SomeObjectj;	.scl	2;	.type	32;	.endef
__Z4Foo1PP10SomeObjectj:
LFB950:
	pushl	%ebp
LCFI24:
	movl	%esp, %ebp
LCFI25:
	subl	$20, %esp
LCFI26:
	movl	$0, -4(%ebp)
	jmp	L20
L21:
	movl	8(%ebp), %eax
	movl	(%eax), %edx
	movl	-4(%ebp), %eax
	leal	(%edx,%eax), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation1Ev
	movl	8(%ebp), %eax
	movl	(%eax), %edx
	movl	-4(%ebp), %eax
	leal	(%edx,%eax), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation2Ev
	movl	8(%ebp), %eax
	movl	(%eax), %edx
	movl	-4(%ebp), %eax
	leal	(%edx,%eax), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation3Ev
	movl	8(%ebp), %eax
	movl	(%eax), %edx
	movl	-4(%ebp), %eax
	leal	(%edx,%eax), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation4Ev
	movl	8(%ebp), %eax
	movl	(%eax), %edx
	movl	-4(%ebp), %eax
	leal	(%edx,%eax), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation5Ev
	movl	8(%ebp), %eax
	movl	(%eax), %edx
	movl	-4(%ebp), %eax
	leal	(%edx,%eax), %eax
	movl	%eax, (%esp)
	call	__ZN10SomeObject10Operation6Ev
	incl	-4(%ebp)
L20:
	movl	-4(%ebp), %eax
	cmpl	12(%ebp), %eax
	setb	%al
	testb	%al, %al
	jne	L21
	leave
LCFI27:
	ret
