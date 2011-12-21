	.file	"varswap.cpp"
	.text
	.p2align 2,,3
	.def	___tcf_0;	.scl	3;	.type	32;	.endef
___tcf_0:
LFB1003:
	pushl	%ebp
LCFI0:
	movl	%esp, %ebp
LCFI1:
	subl	$24, %esp
LCFI2:
	movl	$__ZStL8__ioinit, (%esp)
	call	__ZNSt8ios_base4InitD1Ev
	leave
LCFI3:
	ret
LFE1003:
	.def	___main;	.scl	2;	.type	32;	.endef
	.section .rdata,"dr"
LC0:
	.ascii "finished: a=\0"
LC1:
	.ascii ", b=\0"
	.text
	.p2align 2,,3
.globl _main
	.def	_main;	.scl	2;	.type	32;	.endef
_main:
LFB993:
	pushl	%ebp
LCFI4:
	movl	%esp, %ebp
LCFI5:
	andl	$-16, %esp
LCFI6:
	pushl	%esi
LCFI7:
	pushl	%ebx
LCFI8:
	subl	$24, %esp
LCFI9:
	call	___main
	call	_rand
	movl	%eax, %ebx
	call	_rand
	movl	%eax, %esi
	movl	$1000000, %eax
	jmp	L3
	.p2align 2,,3
L7:
	movl	%ebx, %edx
	movl	%esi, %ebx
	movl	%edx, %esi
L3:
	decl	%eax
	jne	L7
	movl	$12, 8(%esp)
	movl	$LC0, 4(%esp)
	movl	$__ZSt4cout, (%esp)
	call	__ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i
	movl	%esi, 4(%esp)
	movl	$__ZSt4cout, (%esp)
	call	__ZNSolsEi
	movl	%eax, %esi
	movl	$4, 8(%esp)
	movl	$LC1, 4(%esp)
	movl	%eax, (%esp)
	call	__ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i
	movl	%ebx, 4(%esp)
	movl	%esi, (%esp)
	call	__ZNSolsEi
	movl	%eax, %ebx
	movl	(%eax), %eax
	movl	-12(%eax), %eax
	movl	124(%ebx,%eax), %esi
	testl	%esi, %esi
	je	L9
	cmpb	$0, 28(%esi)
	je	L5
	movb	39(%esi), %al
L6:
	movsbl	%al, %eax
	movl	%eax, 4(%esp)
	movl	%ebx, (%esp)
	call	__ZNSo3putEc
	movl	%eax, (%esp)
	call	__ZNSo5flushEv
	xorl	%eax, %eax
	addl	$24, %esp
	popl	%ebx
LCFI10:
	popl	%esi
LCFI11:
	leave
LCFI12:
	ret
L5:
LCFI13:
	movl	%esi, (%esp)
	call	__ZNKSt5ctypeIcE13_M_widen_initEv
	movl	(%esi), %eax
	movl	$10, 4(%esp)
	movl	%esi, (%esp)
	call	*24(%eax)
	jmp	L6
L9:
	call	__ZSt16__throw_bad_castv
LFE993:
	.p2align 2,,3
	.def	__GLOBAL__I_main;	.scl	3;	.type	32;	.endef
__GLOBAL__I_main:
LFB1004:
	pushl	%ebp
LCFI14:
	movl	%esp, %ebp
LCFI15:
	subl	$24, %esp
LCFI16:
	movl	$__ZStL8__ioinit, (%esp)
	call	__ZNSt8ios_base4InitC1Ev
	movl	$___tcf_0, (%esp)
	call	_atexit
	leave
LCFI17:
	ret
LFE1004:
	.section	.ctors,"w"
	.align 4
	.long	__GLOBAL__I_main
.lcomm __ZStL8__ioinit,1,1
	.section	.eh_frame,"w"
Lframe1:
	.long	LECIE1-LSCIE1
LSCIE1:
	.long	0x0
	.byte	0x1
	.ascii "\0"
	.uleb128 0x1
	.sleb128 -4
	.byte	0x8
	.byte	0xc
	.uleb128 0x4
	.uleb128 0x4
	.byte	0x88
	.uleb128 0x1
	.align 4
LECIE1:
LSFDE1:
	.long	LEFDE1-LASFDE1
LASFDE1:
	.long	LASFDE1-Lframe1
	.long	LFB1003
	.long	LFE1003-LFB1003
	.byte	0x4
	.long	LCFI0-LFB1003
	.byte	0xe
	.uleb128 0x8
	.byte	0x85
	.uleb128 0x2
	.byte	0x4
	.long	LCFI1-LCFI0
	.byte	0xd
	.uleb128 0x5
	.byte	0x4
	.long	LCFI3-LCFI1
	.byte	0xc5
	.byte	0xc
	.uleb128 0x4
	.uleb128 0x4
	.align 4
LEFDE1:
LSFDE3:
	.long	LEFDE3-LASFDE3
LASFDE3:
	.long	LASFDE3-Lframe1
	.long	LFB993
	.long	LFE993-LFB993
	.byte	0x4
	.long	LCFI4-LFB993
	.byte	0xe
	.uleb128 0x8
	.byte	0x85
	.uleb128 0x2
	.byte	0x4
	.long	LCFI5-LCFI4
	.byte	0xd
	.uleb128 0x5
	.byte	0x4
	.long	LCFI9-LCFI5
	.byte	0x10
	.byte	0x3
	.uleb128 0x8
	.byte	0x75
	.sleb128 0
	.byte	0x9
	.byte	0xf0
	.byte	0x1a
	.byte	0x9
	.byte	0xf8
	.byte	0x22
	.byte	0x10
	.byte	0x6
	.uleb128 0x8
	.byte	0x75
	.sleb128 0
	.byte	0x9
	.byte	0xf0
	.byte	0x1a
	.byte	0x9
	.byte	0xfc
	.byte	0x22
	.byte	0x4
	.long	LCFI10-LCFI9
	.byte	0xa
	.byte	0xc3
	.byte	0x4
	.long	LCFI11-LCFI10
	.byte	0xc6
	.byte	0x4
	.long	LCFI12-LCFI11
	.byte	0xc5
	.byte	0xc
	.uleb128 0x4
	.uleb128 0x4
	.byte	0x4
	.long	LCFI13-LCFI12
	.byte	0xb
	.align 4
LEFDE3:
LSFDE5:
	.long	LEFDE5-LASFDE5
LASFDE5:
	.long	LASFDE5-Lframe1
	.long	LFB1004
	.long	LFE1004-LFB1004
	.byte	0x4
	.long	LCFI14-LFB1004
	.byte	0xe
	.uleb128 0x8
	.byte	0x85
	.uleb128 0x2
	.byte	0x4
	.long	LCFI15-LCFI14
	.byte	0xd
	.uleb128 0x5
	.byte	0x4
	.long	LCFI17-LCFI15
	.byte	0xc5
	.byte	0xc
	.uleb128 0x4
	.uleb128 0x4
	.align 4
LEFDE5:
	.def	__ZNSt8ios_base4InitD1Ev;	.scl	2;	.type	32;	.endef
	.def	_rand;	.scl	2;	.type	32;	.endef
	.def	__ZSt16__ostream_insertIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_PKS3_i;	.scl	2;	.type	32;	.endef
	.def	__ZNSolsEi;	.scl	2;	.type	32;	.endef
	.def	__ZNSo3putEc;	.scl	2;	.type	32;	.endef
	.def	__ZNSo5flushEv;	.scl	2;	.type	32;	.endef
	.def	__ZNKSt5ctypeIcE13_M_widen_initEv;	.scl	2;	.type	32;	.endef
	.def	__ZSt16__throw_bad_castv;	.scl	2;	.type	32;	.endef
	.def	__ZNSt8ios_base4InitC1Ev;	.scl	2;	.type	32;	.endef
	.def	_atexit;	.scl	2;	.type	32;	.endef
