	.file	"test.c"
	.text
	.globl	mlcstr
	.type	mlcstr, @function
mlcstr:
.LFB0:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	movq	-24(%rbp), %rax
	addq	$1, %rax
	movq	%rax, %rdi
	call	malloc@PLT
	movq	%rax, -8(%rbp)
	movq	-8(%rbp), %rdx
	movq	-24(%rbp), %rax
	addq	%rdx, %rax
	movb	$0, (%rax)
	movq	-8(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	mlcstr, .-mlcstr
	.globl	mlcustr
	.type	mlcustr, @function
mlcustr:
.LFB1:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	movq	-24(%rbp), %rax
	addq	$1, %rax
	movq	%rax, %rdi
	call	malloc@PLT
	movq	%rax, -8(%rbp)
	movq	-8(%rbp), %rdx
	movq	-24(%rbp), %rax
	addq	%rdx, %rax
	movb	$0, (%rax)
	movq	-8(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1:
	.size	mlcustr, .-mlcustr
	.globl	mlcstrm
	.type	mlcstrm, @function
mlcstrm:
.LFB2:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	movq	-24(%rbp), %rax
	addq	$1, %rax
	movq	%rax, %rdi
	call	malloc@PLT
	movq	%rax, -8(%rbp)
	movq	-8(%rbp), %rdx
	movq	-24(%rbp), %rax
	addq	%rdx, %rax
	movb	$-1, (%rax)
	movq	-8(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE2:
	.size	mlcstrm, .-mlcstrm
	.section	.rodata
.LC0:
	.string	"lcjc.h"
.LC1:
	.string	"x != NULL"
	.text
	.globl	ptrlen
	.type	ptrlen, @function
ptrlen:
.LFB3:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L8
	leaq	__PRETTY_FUNCTION__.2477(%rip), %rcx
	movl	$87, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC1(%rip), %rdi
	call	__assert_fail@PLT
.L8:
	movq	-24(%rbp), %rax
	movq	%rax, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, -16(%rbp)
	jmp	.L9
.L10:
	addq	$1, -16(%rbp)
.L9:
	movq	-16(%rbp), %rax
	movzbl	(%rax), %eax
	testb	%al, %al
	jne	.L10
	movq	-16(%rbp), %rax
	subq	-8(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE3:
	.size	ptrlen, .-ptrlen
	.section	.rodata
.LC2:
	.string	"cs != NULL"
	.text
	.globl	cslen
	.type	cslen, @function
cslen:
.LFB4:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L13
	leaq	__PRETTY_FUNCTION__.2486(%rip), %rcx
	movl	$98, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC2(%rip), %rdi
	call	__assert_fail@PLT
.L13:
	movq	$0, -8(%rbp)
	jmp	.L14
.L15:
	addq	$1, -8(%rbp)
.L14:
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	testb	%al, %al
	jne	.L15
	movq	-8(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE4:
	.size	cslen, .-cslen
	.section	.rodata
.LC3:
	.string	"src != NULL"
	.text
	.globl	csup
	.type	csup, @function
csup:
.LFB5:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L18
	leaq	__PRETTY_FUNCTION__.2494(%rip), %rcx
	movl	$107, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC3(%rip), %rdi
	call	__assert_fail@PLT
.L18:
	movq	$0, -8(%rbp)
	jmp	.L19
.L21:
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	cmpb	$96, %al
	jle	.L20
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	cmpb	$122, %al
	jg	.L20
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	leal	-32(%rax), %ecx
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movl	%ecx, %edx
	movb	%dl, (%rax)
.L20:
	addq	$1, -8(%rbp)
.L19:
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	ptrlen
	cmpq	%rax, -8(%rbp)
	jb	.L21
	nop
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE5:
	.size	csup, .-csup
	.globl	cslow
	.type	cslow, @function
cslow:
.LFB6:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L23
	leaq	__PRETTY_FUNCTION__.2502(%rip), %rcx
	movl	$119, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC3(%rip), %rdi
	call	__assert_fail@PLT
.L23:
	movq	$0, -8(%rbp)
	jmp	.L24
.L26:
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	cmpb	$64, %al
	jle	.L25
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	cmpb	$90, %al
	jg	.L25
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	leal	32(%rax), %ecx
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movl	%ecx, %edx
	movb	%dl, (%rax)
.L25:
	addq	$1, -8(%rbp)
.L24:
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	ptrlen
	cmpq	%rax, -8(%rbp)
	jb	.L26
	nop
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE6:
	.size	cslow, .-cslow
	.globl	cscrev
	.type	cscrev, @function
cscrev:
.LFB7:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L28
	leaq	__PRETTY_FUNCTION__.2510(%rip), %rcx
	movl	$131, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC3(%rip), %rdi
	call	__assert_fail@PLT
.L28:
	movq	$0, -8(%rbp)
	jmp	.L29
.L30:
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %ecx
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	xorl	$32, %ecx
	movl	%ecx, %edx
	movb	%dl, (%rax)
	addq	$1, -8(%rbp)
.L29:
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	ptrlen
	cmpq	%rax, -8(%rbp)
	jb	.L30
	nop
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE7:
	.size	cscrev, .-cscrev
	.section	.rodata
.LC4:
	.string	"src != NULL && dst != NULL"
	.text
	.globl	cscpy
	.type	cscpy, @function
cscpy:
.LFB8:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	movq	%rsi, -32(%rbp)
	cmpq	$0, -24(%rbp)
	je	.L32
	cmpq	$0, -32(%rbp)
	jne	.L36
.L32:
	leaq	__PRETTY_FUNCTION__.2519(%rip), %rcx
	movl	$139, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC4(%rip), %rdi
	call	__assert_fail@PLT
.L36:
	movq	$0, -8(%rbp)
	jmp	.L34
.L35:
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movq	-32(%rbp), %rcx
	movq	-8(%rbp), %rdx
	addq	%rcx, %rdx
	movzbl	(%rax), %eax
	movb	%al, (%rdx)
	addq	$1, -8(%rbp)
.L34:
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	cmpq	%rax, -8(%rbp)
	jb	.L35
	nop
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE8:
	.size	cscpy, .-cscpy
	.section	.rodata
	.align 8
.LC5:
	.string	"src != NULL && &start != NULL && &end != NULL"
	.text
	.globl	strsub
	.type	strsub, @function
strsub:
.LFB9:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$48, %rsp
	movq	%rdi, -40(%rbp)
	movl	%esi, -44(%rbp)
	movl	%edx, -48(%rbp)
	cmpq	$0, -40(%rbp)
	jne	.L38
	leaq	__PRETTY_FUNCTION__.2529(%rip), %rcx
	movl	$147, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC5(%rip), %rdi
	call	__assert_fail@PLT
.L38:
	movl	-48(%rbp), %edx
	movl	-44(%rbp), %eax
	subl	%eax, %edx
	movl	%edx, %eax
	cltq
	movq	%rax, -16(%rbp)
	movq	-16(%rbp), %rax
	movq	%rax, %rdi
	call	mlcstr
	movq	%rax, -8(%rbp)
	movq	$0, -24(%rbp)
	jmp	.L39
.L40:
	movl	-44(%rbp), %eax
	movslq	%eax, %rdx
	movq	-24(%rbp), %rax
	addq	%rax, %rdx
	movq	-40(%rbp), %rax
	addq	%rdx, %rax
	movq	-8(%rbp), %rcx
	movq	-24(%rbp), %rdx
	addq	%rcx, %rdx
	movzbl	(%rax), %eax
	movb	%al, (%rdx)
	addq	$1, -24(%rbp)
.L39:
	movq	-24(%rbp), %rax
	cmpq	-16(%rbp), %rax
	jb	.L40
	movq	-8(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE9:
	.size	strsub, .-strsub
	.section	.rodata
	.align 8
.LC6:
	.string	"src != NULL && &old != NULL && &new != NULL"
	.text
	.globl	strepch
	.type	strepch, @function
strepch:
.LFB10:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	movl	%esi, %ecx
	movl	%edx, %eax
	movl	%ecx, %edx
	movb	%dl, -28(%rbp)
	movb	%al, -32(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L43
	leaq	__PRETTY_FUNCTION__.2541(%rip), %rcx
	movl	$160, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC6(%rip), %rdi
	call	__assert_fail@PLT
.L43:
	movq	$0, -8(%rbp)
	jmp	.L44
.L46:
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %edx
	movzbl	-28(%rbp), %eax
	cmpb	%al, %dl
	jne	.L45
	movq	-24(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rax, %rdx
	movzbl	-32(%rbp), %eax
	movb	%al, (%rdx)
.L45:
	addq	$1, -8(%rbp)
.L44:
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	cmpq	%rax, -8(%rbp)
	jb	.L46
	nop
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE10:
	.size	strepch, .-strepch
	.globl	strepall
	.type	strepall, @function
strepall:
.LFB11:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$48, %rsp
	movq	%rdi, -24(%rbp)
	movq	%rsi, -32(%rbp)
	movq	%rdx, -40(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	movq	%rax, -16(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	movq	%rax, %rdi
	call	mlcstr
	movq	%rax, -8(%rbp)
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE11:
	.size	strepall, .-strepall
	.section	.rodata
.LC7:
	.string	"f != NULL"
	.text
	.globl	strmlen
	.type	strmlen, @function
strmlen:
.LFB12:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	cmpq	$0, -8(%rbp)
	jne	.L49
	leaq	__PRETTY_FUNCTION__.2556(%rip), %rcx
	movl	$178, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC7(%rip), %rdi
	call	__assert_fail@PLT
.L49:
	movq	-8(%rbp), %rax
	movl	$2, %edx
	movl	$0, %esi
	movq	%rax, %rdi
	call	fseek@PLT
	movq	-8(%rbp), %rax
	movq	%rax, %rdi
	call	ftell@PLT
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE12:
	.size	strmlen, .-strmlen
	.globl	strmcs
	.type	strmcs, @function
strmcs:
.LFB13:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$64, %rsp
	movq	%rdi, -56(%rbp)
	cmpq	$0, -56(%rbp)
	jne	.L52
	leaq	__PRETTY_FUNCTION__.2560(%rip), %rcx
	movl	$185, %edx
	leaq	.LC0(%rip), %rsi
	leaq	.LC7(%rip), %rdi
	call	__assert_fail@PLT
.L52:
	leaq	strmlen(%rip), %rax
	movq	%rax, -32(%rbp)
	movq	-56(%rbp), %rax
	movq	-32(%rbp), %rdx
	movq	%rax, %rdi
	call	*%rdx
	movq	%rax, -24(%rbp)
	movq	-24(%rbp), %rax
	movq	%rax, %rdi
	call	mlcstrm
	movq	%rax, -16(%rbp)
	movq	-56(%rbp), %rax
	movl	$0, %edx
	movl	$0, %esi
	movq	%rax, %rdi
	call	fseek@PLT
	movq	$0, -40(%rbp)
	jmp	.L53
.L54:
	movq	-16(%rbp), %rdx
	movq	-40(%rbp), %rax
	addq	%rdx, %rax
	movq	-8(%rbp), %rdx
	movb	%dl, (%rax)
	addq	$1, -40(%rbp)
.L53:
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	getc@PLT
	cltq
	movq	%rax, -8(%rbp)
	cmpq	$-1, -8(%rbp)
	jne	.L54
	movq	-16(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE13:
	.size	strmcs, .-strmcs
	.globl	alphabet
	.section	.rodata
	.align 8
.LC8:
	.string	"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
	.section	.data.rel.local,"aw"
	.align 8
	.type	alphabet, @object
	.size	alphabet, 8
alphabet:
	.quad	.LC8
	.text
	.globl	__csb64
	.type	__csb64, @function
__csb64:
.LFB14:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$96, %rsp
	movq	%rdi, -88(%rbp)
	movl	%esi, %eax
	movb	%al, -92(%rbp)
	movl	$64, %edi
	call	mlcustr
	movq	%rax, -48(%rbp)
	movq	alphabet(%rip), %rax
	movq	-48(%rbp), %rdx
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	cscpy
	cmpb	$0, -92(%rbp)
	je	.L57
	movq	alphabet(%rip), %rax
	movq	%rax, %rdi
	call	cslen
	movw	%ax, -66(%rbp)
	movswq	-66(%rbp), %rax
	leaq	-2(%rax), %rdx
	movq	-48(%rbp), %rax
	addq	%rdx, %rax
	movb	$45, (%rax)
	movswq	-66(%rbp), %rax
	leaq	-1(%rax), %rdx
	movq	-48(%rbp), %rax
	addq	%rdx, %rax
	movb	$95, (%rax)
.L57:
	movq	-88(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	movq	%rax, -40(%rbp)
	movq	-40(%rbp), %rax
	movabsq	$-6148914691236517205, %rdx
	mulq	%rdx
	movq	%rdx, %rsi
	shrq	%rsi
	movq	-40(%rbp), %rcx
	movabsq	$-6148914691236517205, %rdx
	movq	%rcx, %rax
	mulq	%rdx
	movq	%rdx, %rax
	shrq	%rax
	movq	%rax, %rdx
	addq	%rdx, %rdx
	addq	%rax, %rdx
	movq	%rcx, %rax
	subq	%rdx, %rax
	testq	%rax, %rax
	je	.L58
	movl	$1, %eax
	jmp	.L59
.L58:
	movl	$0, %eax
.L59:
	addq	%rsi, %rax
	salq	$2, %rax
	movq	%rax, -32(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rdi
	call	mlcustr
	movq	%rax, -24(%rbp)
	movq	$0, -64(%rbp)
	movq	$0, -56(%rbp)
	jmp	.L60
.L65:
	movq	-64(%rbp), %rax
	addq	$1, %rax
	movq	%rax, -16(%rbp)
	movq	-64(%rbp), %rax
	addq	$2, %rax
	movq	%rax, -8(%rbp)
	movq	-88(%rbp), %rdx
	movq	-64(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	shrb	$2, %al
	movzbl	%al, %edx
	movq	-48(%rbp), %rax
	addq	%rdx, %rax
	movq	-24(%rbp), %rcx
	movq	-56(%rbp), %rdx
	addq	%rcx, %rdx
	movzbl	(%rax), %eax
	movb	%al, (%rdx)
	movq	-88(%rbp), %rdx
	movq	-64(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	movzbl	%al, %eax
	sall	$4, %eax
	andl	$48, %eax
	movl	%eax, %ecx
	movq	-88(%rbp), %rdx
	movq	-16(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	shrb	$4, %al
	movzbl	%al, %eax
	orl	%ecx, %eax
	movslq	%eax, %rdx
	movq	-48(%rbp), %rax
	addq	%rdx, %rax
	movq	-56(%rbp), %rdx
	leaq	1(%rdx), %rcx
	movq	-24(%rbp), %rdx
	addq	%rcx, %rdx
	movzbl	(%rax), %eax
	movb	%al, (%rdx)
	movq	-88(%rbp), %rdx
	movq	-16(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	testb	%al, %al
	je	.L61
	movq	-16(%rbp), %rax
	cmpq	-40(%rbp), %rax
	je	.L61
	movq	-88(%rbp), %rdx
	movq	-16(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	movzbl	%al, %eax
	sall	$2, %eax
	andl	$60, %eax
	movl	%eax, %ecx
	movq	-88(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	shrb	$6, %al
	movzbl	%al, %eax
	orl	%ecx, %eax
	movslq	%eax, %rdx
	movq	-48(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	jmp	.L62
.L61:
	movl	$61, %eax
.L62:
	movq	-56(%rbp), %rdx
	leaq	2(%rdx), %rcx
	movq	-24(%rbp), %rdx
	addq	%rcx, %rdx
	movb	%al, (%rdx)
	movq	-88(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	testb	%al, %al
	je	.L63
	movq	-40(%rbp), %rax
	addq	$1, %rax
	cmpq	%rax, -8(%rbp)
	je	.L63
	movq	-88(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	movzbl	%al, %eax
	andl	$63, %eax
	movq	%rax, %rdx
	movq	-48(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	jmp	.L64
.L63:
	movl	$61, %eax
.L64:
	movq	-56(%rbp), %rdx
	leaq	3(%rdx), %rcx
	movq	-24(%rbp), %rdx
	addq	%rcx, %rdx
	movb	%al, (%rdx)
	addq	$3, -64(%rbp)
	addq	$4, -56(%rbp)
.L60:
	movq	-56(%rbp), %rax
	cmpq	-32(%rbp), %rax
	jb	.L65
	cmpb	$0, -92(%rbp)
	je	.L66
	movq	-24(%rbp), %rax
	movl	$43, %edx
	movl	$45, %esi
	movq	%rax, %rdi
	call	strepch
	movq	-24(%rbp), %rax
	movl	$47, %edx
	movl	$95, %esi
	movq	%rax, %rdi
	call	strepch
.L66:
	movq	-24(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE14:
	.size	__csb64, .-__csb64
	.globl	csb64
	.type	csb64, @function
csb64:
.LFB15:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movl	$0, %esi
	movq	%rax, %rdi
	call	__csb64
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE15:
	.size	csb64, .-csb64
	.globl	urlb64
	.type	urlb64, @function
urlb64:
.LFB16:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movl	$1, %esi
	movq	%rax, %rdi
	call	__csb64
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE16:
	.size	urlb64, .-urlb64
	.globl	__b64cs
	.type	__b64cs, @function
__b64cs:
.LFB17:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movq	%rdi, -8(%rbp)
	nop
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE17:
	.size	__b64cs, .-__b64cs
	.section	.rodata
.LC9:
	.string	"ansicol.h"
	.align 8
.LC10:
	.string	"ansicol != NULL && str != NULL"
.LC11:
	.string	"%s"
	.text
	.globl	acolprnt
	.type	acolprnt, @function
acolprnt:
.LFB18:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$40, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -40(%rbp)
	movq	%rsi, -48(%rbp)
	cmpq	$0, -40(%rbp)
	je	.L72
	cmpq	$0, -48(%rbp)
	jne	.L74
.L72:
	leaq	__PRETTY_FUNCTION__.2809(%rip), %rcx
	movl	$92, %edx
	leaq	.LC9(%rip), %rsi
	leaq	.LC10(%rip), %rdi
	call	__assert_fail@PLT
.L74:
	movq	-40(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	movq	%rax, %rbx
	movq	-48(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	addq	%rbx, %rax
	movq	%rax, %rdi
	call	mlcstr
	movq	%rax, -24(%rbp)
	movq	-40(%rbp), %rdx
	movq	-24(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	strcpy@PLT
	movq	-48(%rbp), %rdx
	movq	-24(%rbp), %rax
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	strcat@PLT
	movq	-24(%rbp), %rax
	movq	$-1, %rcx
	movq	%rax, %rdx
	movl	$0, %eax
	movq	%rdx, %rdi
	repnz scasb
	movq	%rcx, %rax
	notq	%rax
	leaq	-1(%rax), %rdx
	movq	-24(%rbp), %rax
	addq	%rdx, %rax
	movl	$1831885595, (%rax)
	movb	$0, 4(%rax)
	movq	-24(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC11(%rip), %rdi
	movl	$0, %eax
	call	printf@PLT
	nop
	addq	$40, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE18:
	.size	acolprnt, .-acolprnt
	.section	.rodata
.LC12:
	.string	"\033[30m"
	.text
	.globl	blackprnt
	.type	blackprnt, @function
blackprnt:
.LFB19:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC12(%rip), %rdi
	call	acolprnt
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE19:
	.size	blackprnt, .-blackprnt
	.section	.rodata
.LC13:
	.string	"\033[31m"
	.text
	.globl	redprnt
	.type	redprnt, @function
redprnt:
.LFB20:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC13(%rip), %rdi
	call	acolprnt
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE20:
	.size	redprnt, .-redprnt
	.section	.rodata
.LC14:
	.string	"\033[32m"
	.text
	.globl	greenprnt
	.type	greenprnt, @function
greenprnt:
.LFB21:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC14(%rip), %rdi
	call	acolprnt
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE21:
	.size	greenprnt, .-greenprnt
	.section	.rodata
.LC15:
	.string	"\033[33m"
	.text
	.globl	yellowprnt
	.type	yellowprnt, @function
yellowprnt:
.LFB22:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC15(%rip), %rdi
	call	acolprnt
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE22:
	.size	yellowprnt, .-yellowprnt
	.section	.rodata
.LC16:
	.string	"\033[34m"
	.text
	.globl	blueprnt
	.type	blueprnt, @function
blueprnt:
.LFB23:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC16(%rip), %rdi
	call	acolprnt
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE23:
	.size	blueprnt, .-blueprnt
	.section	.rodata
.LC17:
	.string	"\033[35m"
	.text
	.globl	fuchsiaprnt
	.type	fuchsiaprnt, @function
fuchsiaprnt:
.LFB24:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC17(%rip), %rdi
	call	acolprnt
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE24:
	.size	fuchsiaprnt, .-fuchsiaprnt
	.section	.rodata
.LC18:
	.string	"\033[36m"
	.text
	.globl	cyanprnt
	.type	cyanprnt, @function
cyanprnt:
.LFB25:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC18(%rip), %rdi
	call	acolprnt
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE25:
	.size	cyanprnt, .-cyanprnt
	.section	.rodata
.LC19:
	.string	"\033[37m"
	.text
	.globl	whiteprnt
	.type	whiteprnt, @function
whiteprnt:
.LFB26:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movq	%rdi, -8(%rbp)
	movq	-8(%rbp), %rax
	movq	%rax, %rsi
	leaq	.LC19(%rip), %rdi
	call	acolprnt
	nop
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE26:
	.size	whiteprnt, .-whiteprnt
	.globl	MIME_MAPPING
	.section	.rodata
.LC20:
	.string	"123"
.LC21:
	.string	"application/vnd.lotus-1-2-3"
.LC22:
	.string	"3dml"
.LC23:
	.string	"text/vnd.in3d.3dml"
.LC24:
	.string	"3ds"
.LC25:
	.string	"image/x-3ds"
.LC26:
	.string	"3g2"
.LC27:
	.string	"video/3gpp2"
.LC28:
	.string	"3gp"
.LC29:
	.string	"video/3gpp"
.LC30:
	.string	"7z"
.LC31:
	.string	"application/x-7z-compressed"
.LC32:
	.string	"aab"
.LC33:
	.string	"application/x-authorware-bin"
.LC34:
	.string	"aac"
.LC35:
	.string	"audio/x-aac"
.LC36:
	.string	"aam"
.LC37:
	.string	"application/x-authorware-map"
.LC38:
	.string	"aas"
.LC39:
	.string	"application/x-authorware-seg"
.LC40:
	.string	"abs"
.LC41:
	.string	"audio/x-mpeg"
.LC42:
	.string	"abw"
.LC43:
	.string	"application/x-abiword"
.LC44:
	.string	"ac"
.LC45:
	.string	"application/pkix-attr-cert"
.LC46:
	.string	"acc"
	.align 8
.LC47:
	.string	"application/vnd.americandynamics.acc"
.LC48:
	.string	"ace"
.LC49:
	.string	"application/x-ace-compressed"
.LC50:
	.string	"acu"
.LC51:
	.string	"application/vnd.acucobol"
.LC52:
	.string	"acutc"
.LC53:
	.string	"application/vnd.acucorp"
.LC54:
	.string	"adp"
.LC55:
	.string	"audio/adpcm"
.LC56:
	.string	"aep"
.LC57:
	.string	"application/vnd.audiograph"
.LC58:
	.string	"afm"
.LC59:
	.string	"application/x-font-type1"
.LC60:
	.string	"afp"
.LC61:
	.string	"application/vnd.ibm.modcap"
.LC62:
	.string	"ahead"
.LC63:
	.string	"application/vnd.ahead.space"
.LC64:
	.string	"ai"
.LC65:
	.string	"application/postscript"
.LC66:
	.string	"aif"
.LC67:
	.string	"audio/x-aiff"
.LC68:
	.string	"aifc"
.LC69:
	.string	"aiff"
.LC70:
	.string	"aim"
.LC71:
	.string	"application/x-aim"
.LC72:
	.string	"air"
	.align 8
.LC73:
	.string	"application/vnd.adobe.air-application-installer-package+zip"
.LC74:
	.string	"ait"
.LC75:
	.string	"application/vnd.dvb.ait"
.LC76:
	.string	"ami"
.LC77:
	.string	"application/vnd.amiga.ami"
.LC78:
	.string	"anx"
.LC79:
	.string	"application/annodex"
.LC80:
	.string	"apk"
	.align 8
.LC81:
	.string	"application/vnd.android.package-archive"
.LC82:
	.string	"appcache"
.LC83:
	.string	"text/cache-manifest"
.LC84:
	.string	"application"
.LC85:
	.string	"application/x-ms-application"
.LC86:
	.string	"apr"
	.align 8
.LC87:
	.string	"application/vnd.lotus-approach"
.LC88:
	.string	"arc"
.LC89:
	.string	"application/x-freearc"
.LC90:
	.string	"art"
.LC91:
	.string	"image/x-jg"
.LC92:
	.string	"asc"
.LC93:
	.string	"application/pgp-signature"
.LC94:
	.string	"asf"
.LC95:
	.string	"video/x-ms-asf"
.LC96:
	.string	"asm"
.LC97:
	.string	"text/x-asm"
.LC98:
	.string	"aso"
	.align 8
.LC99:
	.string	"application/vnd.accpac.simply.aso"
.LC100:
	.string	"asx"
.LC101:
	.string	"atc"
.LC102:
	.string	"atom"
.LC103:
	.string	"application/atom+xml"
.LC104:
	.string	"atomcat"
.LC105:
	.string	"application/atomcat+xml"
.LC106:
	.string	"atomsvc"
.LC107:
	.string	"application/atomsvc+xml"
.LC108:
	.string	"atx"
	.align 8
.LC109:
	.string	"application/vnd.antix.game-component"
.LC110:
	.string	"au"
.LC111:
	.string	"audio/basic"
.LC112:
	.string	"avi"
.LC113:
	.string	"video/x-msvideo"
.LC114:
	.string	"avx"
.LC115:
	.string	"video/x-rad-screenplay"
.LC116:
	.string	"aw"
.LC117:
	.string	"application/applixware"
.LC118:
	.string	"axa"
.LC119:
	.string	"audio/annodex"
.LC120:
	.string	"axv"
.LC121:
	.string	"video/annodex"
.LC122:
	.string	"azf"
	.align 8
.LC123:
	.string	"application/vnd.airzip.filesecure.azf"
.LC124:
	.string	"azs"
	.align 8
.LC125:
	.string	"application/vnd.airzip.filesecure.azs"
.LC126:
	.string	"azw"
.LC127:
	.string	"application/vnd.amazon.ebook"
.LC128:
	.string	"bat"
.LC129:
	.string	"application/x-msdownload"
.LC130:
	.string	"bcpio"
.LC131:
	.string	"application/x-bcpio"
.LC132:
	.string	"bdf"
.LC133:
	.string	"application/x-font-bdf"
.LC134:
	.string	"bdm"
	.align 8
.LC135:
	.string	"application/vnd.syncml.dm+wbxml"
.LC136:
	.string	"bed"
.LC137:
	.string	"application/vnd.realvnc.bed"
.LC138:
	.string	"bh2"
	.align 8
.LC139:
	.string	"application/vnd.fujitsu.oasysprs"
.LC140:
	.string	"bin"
.LC141:
	.string	"application/octet-stream"
.LC142:
	.string	"blb"
.LC143:
	.string	"application/x-blorb"
.LC144:
	.string	"blorb"
.LC145:
	.string	"bmi"
.LC146:
	.string	"application/vnd.bmi"
.LC147:
	.string	"bmp"
.LC148:
	.string	"image/bmp"
.LC149:
	.string	"body"
.LC150:
	.string	"text/html"
.LC151:
	.string	"book"
.LC152:
	.string	"application/vnd.framemaker"
.LC153:
	.string	"box"
	.align 8
.LC154:
	.string	"application/vnd.previewsystems.box"
.LC155:
	.string	"boz"
.LC156:
	.string	"application/x-bzip2"
.LC157:
	.string	"bpk"
.LC158:
	.string	"btif"
.LC159:
	.string	"image/prs.btif"
.LC160:
	.string	"bz"
.LC161:
	.string	"application/x-bzip"
.LC162:
	.string	"bz2"
.LC163:
	.string	"c"
.LC164:
	.string	"text/x-c"
.LC165:
	.string	"c11amc"
	.align 8
.LC166:
	.string	"application/vnd.cluetrust.cartomobile-config"
.LC167:
	.string	"c11amz"
	.align 8
.LC168:
	.string	"application/vnd.cluetrust.cartomobile-config-pkg"
.LC169:
	.string	"c4d"
.LC170:
	.string	"application/vnd.clonk.c4group"
.LC171:
	.string	"c4f"
.LC172:
	.string	"c4g"
.LC173:
	.string	"c4p"
.LC174:
	.string	"c4u"
.LC175:
	.string	"cab"
	.align 8
.LC176:
	.string	"application/vnd.ms-cab-compressed"
.LC177:
	.string	"caf"
.LC178:
	.string	"audio/x-caf"
.LC179:
	.string	"cap"
.LC180:
	.string	"application/vnd.tcpdump.pcap"
.LC181:
	.string	"car"
.LC182:
	.string	"application/vnd.curl.car"
.LC183:
	.string	"cat"
.LC184:
	.string	"application/vnd.ms-pki.seccat"
.LC185:
	.string	"cb7"
.LC186:
	.string	"application/x-cbr"
.LC187:
	.string	"cba"
.LC188:
	.string	"cbr"
.LC189:
	.string	"cbt"
.LC190:
	.string	"cbz"
.LC191:
	.string	"cc"
.LC192:
	.string	"cct"
.LC193:
	.string	"application/x-director"
.LC194:
	.string	"ccxml"
.LC195:
	.string	"application/ccxml+xml"
.LC196:
	.string	"cdbcmsg"
.LC197:
	.string	"application/vnd.contact.cmsg"
.LC198:
	.string	"cdf"
.LC199:
	.string	"application/x-cdf"
.LC200:
	.string	"cdkey"
	.align 8
.LC201:
	.string	"application/vnd.mediastation.cdkey"
.LC202:
	.string	"cdmia"
.LC203:
	.string	"application/cdmi-capability"
.LC204:
	.string	"cdmic"
.LC205:
	.string	"application/cdmi-container"
.LC206:
	.string	"cdmid"
.LC207:
	.string	"application/cdmi-domain"
.LC208:
	.string	"cdmio"
.LC209:
	.string	"application/cdmi-object"
.LC210:
	.string	"cdmiq"
.LC211:
	.string	"application/cdmi-queue"
.LC212:
	.string	"cdx"
.LC213:
	.string	"chemical/x-cdx"
.LC214:
	.string	"cdxml"
.LC215:
	.string	"application/vnd.chemdraw+xml"
.LC216:
	.string	"cdy"
.LC217:
	.string	"application/vnd.cinderella"
.LC218:
	.string	"cer"
.LC219:
	.string	"application/pkix-cert"
.LC220:
	.string	"cfs"
.LC221:
	.string	"application/x-cfs-compressed"
.LC222:
	.string	"cgm"
.LC223:
	.string	"image/cgm"
.LC224:
	.string	"chat"
.LC225:
	.string	"application/x-chat"
.LC226:
	.string	"chm"
.LC227:
	.string	"application/vnd.ms-htmlhelp"
.LC228:
	.string	"chrt"
.LC229:
	.string	"application/vnd.kde.kchart"
.LC230:
	.string	"cif"
.LC231:
	.string	"chemical/x-cif"
.LC232:
	.string	"cii"
	.align 8
.LC233:
	.string	"application/vnd.anser-web-certificate-issue-initiation"
.LC234:
	.string	"cil"
.LC235:
	.string	"application/vnd.ms-artgalry"
.LC236:
	.string	"cla"
.LC237:
	.string	"application/vnd.claymore"
.LC238:
	.string	"class"
.LC239:
	.string	"application/java"
.LC240:
	.string	"clkk"
	.align 8
.LC241:
	.string	"application/vnd.crick.clicker.keyboard"
.LC242:
	.string	"clkp"
	.align 8
.LC243:
	.string	"application/vnd.crick.clicker.palette"
.LC244:
	.string	"clkt"
	.align 8
.LC245:
	.string	"application/vnd.crick.clicker.template"
.LC246:
	.string	"clkw"
	.align 8
.LC247:
	.string	"application/vnd.crick.clicker.wordbank"
.LC248:
	.string	"clkx"
.LC249:
	.string	"application/vnd.crick.clicker"
.LC250:
	.string	"clp"
.LC251:
	.string	"application/x-msclip"
.LC252:
	.string	"cmc"
.LC253:
	.string	"application/vnd.cosmocaller"
.LC254:
	.string	"cmdf"
.LC255:
	.string	"chemical/x-cmdf"
.LC256:
	.string	"cml"
.LC257:
	.string	"chemical/x-cml"
.LC258:
	.string	"cmp"
	.align 8
.LC259:
	.string	"application/vnd.yellowriver-custom-menu"
.LC260:
	.string	"cmx"
.LC261:
	.string	"image/x-cmx"
.LC262:
	.string	"cod"
.LC263:
	.string	"application/vnd.rim.cod"
.LC264:
	.string	"com"
.LC265:
	.string	"conf"
.LC266:
	.string	"text/plain"
.LC267:
	.string	"cpio"
.LC268:
	.string	"application/x-cpio"
.LC269:
	.string	"cpp"
.LC270:
	.string	"cpt"
.LC271:
	.string	"application/mac-compactpro"
.LC272:
	.string	"crd"
.LC273:
	.string	"application/x-mscardfile"
.LC274:
	.string	"crl"
.LC275:
	.string	"application/pkix-crl"
.LC276:
	.string	"crt"
.LC277:
	.string	"application/x-x509-ca-cert"
.LC278:
	.string	"cryptonote"
	.align 8
.LC279:
	.string	"application/vnd.rig.cryptonote"
.LC280:
	.string	"csh"
.LC281:
	.string	"application/x-csh"
.LC282:
	.string	"csml"
.LC283:
	.string	"chemical/x-csml"
.LC284:
	.string	"csp"
.LC285:
	.string	"application/vnd.commonspace"
.LC286:
	.string	"css"
.LC287:
	.string	"text/css"
.LC288:
	.string	"cst"
.LC289:
	.string	"csv"
.LC290:
	.string	"text/csv"
.LC291:
	.string	"cu"
.LC292:
	.string	"application/cu-seeme"
.LC293:
	.string	"curl"
.LC294:
	.string	"text/vnd.curl"
.LC295:
	.string	"cww"
.LC296:
	.string	"application/prs.cww"
.LC297:
	.string	"cxt"
.LC298:
	.string	"cxx"
.LC299:
	.string	"dae"
.LC300:
	.string	"model/vnd.collada+xml"
.LC301:
	.string	"daf"
.LC302:
	.string	"application/vnd.mobius.daf"
.LC303:
	.string	"dart"
.LC304:
	.string	"application/vnd.dart"
.LC305:
	.string	"dataless"
.LC306:
	.string	"application/vnd.fdsn.seed"
.LC307:
	.string	"davmount"
.LC308:
	.string	"application/davmount+xml"
.LC309:
	.string	"dbk"
.LC310:
	.string	"application/docbook+xml"
.LC311:
	.string	"dcr"
.LC312:
	.string	"dcurl"
.LC313:
	.string	"text/vnd.curl.dcurl"
.LC314:
	.string	"dd2"
.LC315:
	.string	"application/vnd.oma.dd2+xml"
.LC316:
	.string	"ddd"
.LC317:
	.string	"application/vnd.fujixerox.ddd"
.LC318:
	.string	"deb"
.LC319:
	.string	"application/x-debian-package"
.LC320:
	.string	"def"
.LC321:
	.string	"deploy"
.LC322:
	.string	"der"
.LC323:
	.string	"dfac"
.LC324:
	.string	"application/vnd.dreamfactory"
.LC325:
	.string	"dgc"
.LC326:
	.string	"application/x-dgc-compressed"
.LC327:
	.string	"dib"
.LC328:
	.string	"dic"
.LC329:
	.string	"dir"
.LC330:
	.string	"dis"
.LC331:
	.string	"application/vnd.mobius.dis"
.LC332:
	.string	"dist"
.LC333:
	.string	"distz"
.LC334:
	.string	"djv"
.LC335:
	.string	"image/vnd.djvu"
.LC336:
	.string	"djvu"
.LC337:
	.string	"dll"
.LC338:
	.string	"dmg"
.LC339:
	.string	"application/x-apple-diskimage"
.LC340:
	.string	"dmp"
.LC341:
	.string	"dms"
.LC342:
	.string	"dna"
.LC343:
	.string	"application/vnd.dna"
.LC344:
	.string	"doc"
.LC345:
	.string	"application/msword"
.LC346:
	.string	"docm"
	.align 8
.LC347:
	.string	"application/vnd.ms-word.document.macroenabled.12"
.LC348:
	.string	"docx"
	.align 8
.LC349:
	.string	"application/vnd.openxmlformats-officedocument.wordprocessingml.document"
.LC350:
	.string	"dot"
.LC351:
	.string	"dotm"
	.align 8
.LC352:
	.string	"application/vnd.ms-word.template.macroenabled.12"
.LC353:
	.string	"dotx"
	.align 8
.LC354:
	.string	"application/vnd.openxmlformats-officedocument.wordprocessingml.template"
.LC355:
	.string	"dp"
.LC356:
	.string	"application/vnd.osgi.dp"
.LC357:
	.string	"dpg"
.LC358:
	.string	"application/vnd.dpgraph"
.LC359:
	.string	"dra"
.LC360:
	.string	"audio/vnd.dra"
.LC361:
	.string	"dsc"
.LC362:
	.string	"text/prs.lines.tag"
.LC363:
	.string	"dssc"
.LC364:
	.string	"application/dssc+der"
.LC365:
	.string	"dtb"
.LC366:
	.string	"application/x-dtbook+xml"
.LC367:
	.string	"dtd"
.LC368:
	.string	"application/xml-dtd"
.LC369:
	.string	"dts"
.LC370:
	.string	"audio/vnd.dts"
.LC371:
	.string	"dtshd"
.LC372:
	.string	"audio/vnd.dts.hd"
.LC373:
	.string	"dump"
.LC374:
	.string	"dv"
.LC375:
	.string	"video/x-dv"
.LC376:
	.string	"dvb"
.LC377:
	.string	"video/vnd.dvb.file"
.LC378:
	.string	"dvi"
.LC379:
	.string	"application/x-dvi"
.LC380:
	.string	"dwf"
.LC381:
	.string	"model/vnd.dwf"
.LC382:
	.string	"dwg"
.LC383:
	.string	"image/vnd.dwg"
.LC384:
	.string	"dxf"
.LC385:
	.string	"image/vnd.dxf"
.LC386:
	.string	"dxp"
.LC387:
	.string	"application/vnd.spotfire.dxp"
.LC388:
	.string	"dxr"
.LC389:
	.string	"ecelp4800"
.LC390:
	.string	"audio/vnd.nuera.ecelp4800"
.LC391:
	.string	"ecelp7470"
.LC392:
	.string	"audio/vnd.nuera.ecelp7470"
.LC393:
	.string	"ecelp9600"
.LC394:
	.string	"audio/vnd.nuera.ecelp9600"
.LC395:
	.string	"ecma"
.LC396:
	.string	"application/ecmascript"
.LC397:
	.string	"edm"
.LC398:
	.string	"application/vnd.novadigm.edm"
.LC399:
	.string	"edx"
.LC400:
	.string	"application/vnd.novadigm.edx"
.LC401:
	.string	"efif"
.LC402:
	.string	"application/vnd.picsel"
.LC403:
	.string	"ei6"
.LC404:
	.string	"application/vnd.pg.osasli"
.LC405:
	.string	"elc"
.LC406:
	.string	"emf"
.LC407:
	.string	"application/x-msmetafile"
.LC408:
	.string	"eml"
.LC409:
	.string	"message/rfc822"
.LC410:
	.string	"emma"
.LC411:
	.string	"application/emma+xml"
.LC412:
	.string	"emz"
.LC413:
	.string	"eol"
.LC414:
	.string	"audio/vnd.digital-winds"
.LC415:
	.string	"eot"
.LC416:
	.string	"application/vnd.ms-fontobject"
.LC417:
	.string	"eps"
.LC418:
	.string	"epub"
.LC419:
	.string	"application/epub+zip"
.LC420:
	.string	"es3"
.LC421:
	.string	"application/vnd.eszigno3+xml"
.LC422:
	.string	"esa"
	.align 8
.LC423:
	.string	"application/vnd.osgi.subsystem"
.LC424:
	.string	"esf"
.LC425:
	.string	"application/vnd.epson.esf"
.LC426:
	.string	"et3"
.LC427:
	.string	"etx"
.LC428:
	.string	"text/x-setext"
.LC429:
	.string	"eva"
.LC430:
	.string	"application/x-eva"
.LC431:
	.string	"evy"
.LC432:
	.string	"application/x-envoy"
.LC433:
	.string	"exe"
.LC434:
	.string	"exi"
.LC435:
	.string	"application/exi"
.LC436:
	.string	"ext"
.LC437:
	.string	"application/vnd.novadigm.ext"
.LC438:
	.string	"ez"
.LC439:
	.string	"application/andrew-inset"
.LC440:
	.string	"ez2"
.LC441:
	.string	"application/vnd.ezpix-album"
.LC442:
	.string	"ez3"
.LC443:
	.string	"application/vnd.ezpix-package"
.LC444:
	.string	"f"
.LC445:
	.string	"text/x-fortran"
.LC446:
	.string	"f4v"
.LC447:
	.string	"video/x-f4v"
.LC448:
	.string	"f77"
.LC449:
	.string	"f90"
.LC450:
	.string	"fbs"
.LC451:
	.string	"image/vnd.fastbidsheet"
.LC452:
	.string	"fcdt"
	.align 8
.LC453:
	.string	"application/vnd.adobe.formscentral.fcdt"
.LC454:
	.string	"fcs"
.LC455:
	.string	"application/vnd.isac.fcs"
.LC456:
	.string	"fdf"
.LC457:
	.string	"application/vnd.fdf"
.LC458:
	.string	"fe_launch"
	.align 8
.LC459:
	.string	"application/vnd.denovo.fcselayout-link"
.LC460:
	.string	"fg5"
	.align 8
.LC461:
	.string	"application/vnd.fujitsu.oasysgp"
.LC462:
	.string	"fgd"
.LC463:
	.string	"fh"
.LC464:
	.string	"image/x-freehand"
.LC465:
	.string	"fh4"
.LC466:
	.string	"fh5"
.LC467:
	.string	"fh7"
.LC468:
	.string	"fhc"
.LC469:
	.string	"fig"
.LC470:
	.string	"application/x-xfig"
.LC471:
	.string	"flac"
.LC472:
	.string	"audio/flac"
.LC473:
	.string	"fli"
.LC474:
	.string	"video/x-fli"
.LC475:
	.string	"flo"
	.align 8
.LC476:
	.string	"application/vnd.micrografx.flo"
.LC477:
	.string	"flv"
.LC478:
	.string	"video/x-flv"
.LC479:
	.string	"flw"
.LC480:
	.string	"application/vnd.kde.kivio"
.LC481:
	.string	"flx"
.LC482:
	.string	"text/vnd.fmi.flexstor"
.LC483:
	.string	"fly"
.LC484:
	.string	"text/vnd.fly"
.LC485:
	.string	"fm"
.LC486:
	.string	"fnc"
.LC487:
	.string	"application/vnd.frogans.fnc"
.LC488:
	.string	"for"
.LC489:
	.string	"fpx"
.LC490:
	.string	"image/vnd.fpx"
.LC491:
	.string	"frame"
.LC492:
	.string	"fsc"
.LC493:
	.string	"application/vnd.fsc.weblaunch"
.LC494:
	.string	"fst"
.LC495:
	.string	"image/vnd.fst"
.LC496:
	.string	"ftc"
.LC497:
	.string	"application/vnd.fluxtime.clip"
.LC498:
	.string	"fti"
	.align 8
.LC499:
	.string	"application/vnd.anser-web-funds-transfer-initiation"
.LC500:
	.string	"fvt"
.LC501:
	.string	"video/vnd.fvt"
.LC502:
	.string	"fxp"
.LC503:
	.string	"application/vnd.adobe.fxp"
.LC504:
	.string	"fxpl"
.LC505:
	.string	"fzs"
.LC506:
	.string	"application/vnd.fuzzysheet"
.LC507:
	.string	"g2w"
.LC508:
	.string	"application/vnd.geoplan"
.LC509:
	.string	"g3"
.LC510:
	.string	"image/g3fax"
.LC511:
	.string	"g3w"
.LC512:
	.string	"application/vnd.geospace"
.LC513:
	.string	"gac"
	.align 8
.LC514:
	.string	"application/vnd.groove-account"
.LC515:
	.string	"gam"
.LC516:
	.string	"application/x-tads"
.LC517:
	.string	"gbr"
.LC518:
	.string	"application/rpki-ghostbusters"
.LC519:
	.string	"gca"
.LC520:
	.string	"application/x-gca-compressed"
.LC521:
	.string	"gdl"
.LC522:
	.string	"model/vnd.gdl"
.LC523:
	.string	"geo"
.LC524:
	.string	"application/vnd.dynageo"
.LC525:
	.string	"gex"
	.align 8
.LC526:
	.string	"application/vnd.geometry-explorer"
.LC527:
	.string	"ggb"
.LC528:
	.string	"application/vnd.geogebra.file"
.LC529:
	.string	"ggt"
.LC530:
	.string	"application/vnd.geogebra.tool"
.LC531:
	.string	"ghf"
.LC532:
	.string	"application/vnd.groove-help"
.LC533:
	.string	"gif"
.LC534:
	.string	"image/gif"
.LC535:
	.string	"gim"
	.align 8
.LC536:
	.string	"application/vnd.groove-identity-message"
.LC537:
	.string	"gml"
.LC538:
	.string	"application/gml+xml"
.LC539:
	.string	"gmx"
.LC540:
	.string	"application/vnd.gmx"
.LC541:
	.string	"gnumeric"
.LC542:
	.string	"application/x-gnumeric"
.LC543:
	.string	"gph"
.LC544:
	.string	"application/vnd.flographit"
.LC545:
	.string	"gpx"
.LC546:
	.string	"application/gpx+xml"
.LC547:
	.string	"gqf"
.LC548:
	.string	"application/vnd.grafeq"
.LC549:
	.string	"gqs"
.LC550:
	.string	"gram"
.LC551:
	.string	"application/srgs"
.LC552:
	.string	"gramps"
.LC553:
	.string	"application/x-gramps-xml"
.LC554:
	.string	"gre"
.LC555:
	.string	"grv"
	.align 8
.LC556:
	.string	"application/vnd.groove-injector"
.LC557:
	.string	"grxml"
.LC558:
	.string	"application/srgs+xml"
.LC559:
	.string	"gsf"
	.align 8
.LC560:
	.string	"application/x-font-ghostscript"
.LC561:
	.string	"gtar"
.LC562:
	.string	"application/x-gtar"
.LC563:
	.string	"gtm"
	.align 8
.LC564:
	.string	"application/vnd.groove-tool-message"
.LC565:
	.string	"gtw"
.LC566:
	.string	"model/vnd.gtw"
.LC567:
	.string	"gv"
.LC568:
	.string	"text/vnd.graphviz"
.LC569:
	.string	"gxf"
.LC570:
	.string	"application/gxf"
.LC571:
	.string	"gxt"
.LC572:
	.string	"application/vnd.geonext"
.LC573:
	.string	"gz"
.LC574:
	.string	"application/x-gzip"
.LC575:
	.string	"h"
.LC576:
	.string	"h261"
.LC577:
	.string	"video/h261"
.LC578:
	.string	"h263"
.LC579:
	.string	"video/h263"
.LC580:
	.string	"h264"
.LC581:
	.string	"video/h264"
.LC582:
	.string	"hal"
.LC583:
	.string	"application/vnd.hal+xml"
.LC584:
	.string	"hbci"
.LC585:
	.string	"application/vnd.hbci"
.LC586:
	.string	"hdf"
.LC587:
	.string	"application/x-hdf"
.LC588:
	.string	"hh"
.LC589:
	.string	"hlp"
.LC590:
	.string	"application/winhlp"
.LC591:
	.string	"hpgl"
.LC592:
	.string	"application/vnd.hp-hpgl"
.LC593:
	.string	"hpid"
.LC594:
	.string	"application/vnd.hp-hpid"
.LC595:
	.string	"hps"
.LC596:
	.string	"application/vnd.hp-hps"
.LC597:
	.string	"hqx"
.LC598:
	.string	"application/mac-binhex40"
.LC599:
	.string	"htc"
.LC600:
	.string	"text/x-component"
.LC601:
	.string	"htke"
.LC602:
	.string	"application/vnd.kenameaapp"
.LC603:
	.string	"htm"
.LC604:
	.string	"html"
.LC605:
	.string	"hvd"
.LC606:
	.string	"application/vnd.yamaha.hv-dic"
.LC607:
	.string	"hvp"
	.align 8
.LC608:
	.string	"application/vnd.yamaha.hv-voice"
.LC609:
	.string	"hvs"
	.align 8
.LC610:
	.string	"application/vnd.yamaha.hv-script"
.LC611:
	.string	"i2g"
.LC612:
	.string	"application/vnd.intergeo"
.LC613:
	.string	"icc"
.LC614:
	.string	"application/vnd.iccprofile"
.LC615:
	.string	"ice"
.LC616:
	.string	"x-conference/x-cooltalk"
.LC617:
	.string	"icm"
.LC618:
	.string	"ico"
.LC619:
	.string	"image/x-icon"
.LC620:
	.string	"ics"
.LC621:
	.string	"text/calendar"
.LC622:
	.string	"ief"
.LC623:
	.string	"image/ief"
.LC624:
	.string	"ifb"
.LC625:
	.string	"ifm"
	.align 8
.LC626:
	.string	"application/vnd.shana.informed.formdata"
.LC627:
	.string	"iges"
.LC628:
	.string	"model/iges"
.LC629:
	.string	"igl"
.LC630:
	.string	"application/vnd.igloader"
.LC631:
	.string	"igm"
.LC632:
	.string	"application/vnd.insors.igm"
.LC633:
	.string	"igs"
.LC634:
	.string	"igx"
	.align 8
.LC635:
	.string	"application/vnd.micrografx.igx"
.LC636:
	.string	"iif"
	.align 8
.LC637:
	.string	"application/vnd.shana.informed.interchange"
.LC638:
	.string	"imp"
	.align 8
.LC639:
	.string	"application/vnd.accpac.simply.imp"
.LC640:
	.string	"ims"
.LC641:
	.string	"application/vnd.ms-ims"
.LC642:
	.string	"in"
.LC643:
	.string	"ink"
.LC644:
	.string	"application/inkml+xml"
.LC645:
	.string	"inkml"
.LC646:
	.string	"install"
	.align 8
.LC647:
	.string	"application/x-install-instructions"
.LC648:
	.string	"iota"
	.align 8
.LC649:
	.string	"application/vnd.astraea-software.iota"
.LC650:
	.string	"ipfix"
.LC651:
	.string	"application/ipfix"
.LC652:
	.string	"ipk"
	.align 8
.LC653:
	.string	"application/vnd.shana.informed.package"
.LC654:
	.string	"irm"
	.align 8
.LC655:
	.string	"application/vnd.ibm.rights-management"
.LC656:
	.string	"irp"
	.align 8
.LC657:
	.string	"application/vnd.irepository.package+xml"
.LC658:
	.string	"iso"
.LC659:
	.string	"application/x-iso9660-image"
.LC660:
	.string	"itp"
	.align 8
.LC661:
	.string	"application/vnd.shana.informed.formtemplate"
.LC662:
	.string	"ivp"
	.align 8
.LC663:
	.string	"application/vnd.immervision-ivp"
.LC664:
	.string	"ivu"
	.align 8
.LC665:
	.string	"application/vnd.immervision-ivu"
.LC666:
	.string	"jad"
	.align 8
.LC667:
	.string	"text/vnd.sun.j2me.app-descriptor"
.LC668:
	.string	"jam"
.LC669:
	.string	"application/vnd.jam"
.LC670:
	.string	"jar"
.LC671:
	.string	"application/java-archive"
.LC672:
	.string	"java"
.LC673:
	.string	"text/x-java-source"
.LC674:
	.string	"jisp"
.LC675:
	.string	"application/vnd.jisp"
.LC676:
	.string	"jlt"
.LC677:
	.string	"application/vnd.hp-jlyt"
.LC678:
	.string	"jnlp"
.LC679:
	.string	"application/x-java-jnlp-file"
.LC680:
	.string	"joda"
	.align 8
.LC681:
	.string	"application/vnd.joost.joda-archive"
.LC682:
	.string	"jpe"
.LC683:
	.string	"image/jpeg"
.LC684:
	.string	"jpeg"
.LC685:
	.string	"jpg"
.LC686:
	.string	"jpgm"
.LC687:
	.string	"video/jpm"
.LC688:
	.string	"jpgv"
.LC689:
	.string	"video/jpeg"
.LC690:
	.string	"jpm"
.LC691:
	.string	"js"
.LC692:
	.string	"application/javascript"
.LC693:
	.string	"jsf"
.LC694:
	.string	"json"
.LC695:
	.string	"application/json"
.LC696:
	.string	"jsonml"
.LC697:
	.string	"application/jsonml+json"
.LC698:
	.string	"jspf"
.LC699:
	.string	"kar"
.LC700:
	.string	"audio/midi"
.LC701:
	.string	"karbon"
.LC702:
	.string	"application/vnd.kde.karbon"
.LC703:
	.string	"kfo"
.LC704:
	.string	"application/vnd.kde.kformula"
.LC705:
	.string	"kia"
.LC706:
	.string	"application/vnd.kidspiration"
.LC707:
	.string	"kml"
	.align 8
.LC708:
	.string	"application/vnd.google-earth.kml+xml"
.LC709:
	.string	"kmz"
	.align 8
.LC710:
	.string	"application/vnd.google-earth.kmz"
.LC711:
	.string	"kne"
.LC712:
	.string	"application/vnd.kinar"
.LC713:
	.string	"knp"
.LC714:
	.string	"kon"
.LC715:
	.string	"application/vnd.kde.kontour"
.LC716:
	.string	"kpr"
	.align 8
.LC717:
	.string	"application/vnd.kde.kpresenter"
.LC718:
	.string	"kpt"
.LC719:
	.string	"kpxx"
.LC720:
	.string	"application/vnd.ds-keypoint"
.LC721:
	.string	"ksp"
.LC722:
	.string	"application/vnd.kde.kspread"
.LC723:
	.string	"ktr"
.LC724:
	.string	"application/vnd.kahootz"
.LC725:
	.string	"ktx"
.LC726:
	.string	"image/ktx"
.LC727:
	.string	"ktz"
.LC728:
	.string	"kwd"
.LC729:
	.string	"application/vnd.kde.kword"
.LC730:
	.string	"kwt"
.LC731:
	.string	"lasxml"
.LC732:
	.string	"application/vnd.las.las+xml"
.LC733:
	.string	"latex"
.LC734:
	.string	"application/x-latex"
.LC735:
	.string	"lbd"
	.align 8
.LC736:
	.string	"application/vnd.llamagraphics.life-balance.desktop"
.LC737:
	.string	"lbe"
	.align 8
.LC738:
	.string	"application/vnd.llamagraphics.life-balance.exchange+xml"
.LC739:
	.string	"les"
	.align 8
.LC740:
	.string	"application/vnd.hhe.lesson-player"
.LC741:
	.string	"lha"
.LC742:
	.string	"application/x-lzh-compressed"
.LC743:
	.string	"link66"
	.align 8
.LC744:
	.string	"application/vnd.route66.link66+xml"
.LC745:
	.string	"list"
.LC746:
	.string	"list3820"
.LC747:
	.string	"listafp"
.LC748:
	.string	"lnk"
.LC749:
	.string	"application/x-ms-shortcut"
.LC750:
	.string	"log"
.LC751:
	.string	"lostxml"
.LC752:
	.string	"application/lost+xml"
.LC753:
	.string	"lrf"
.LC754:
	.string	"lrm"
.LC755:
	.string	"application/vnd.ms-lrm"
.LC756:
	.string	"ltf"
.LC757:
	.string	"application/vnd.frogans.ltf"
.LC758:
	.string	"lvp"
.LC759:
	.string	"audio/vnd.lucent.voice"
.LC760:
	.string	"lwp"
.LC761:
	.string	"application/vnd.lotus-wordpro"
.LC762:
	.string	"lzh"
.LC763:
	.string	"m13"
.LC764:
	.string	"application/x-msmediaview"
.LC765:
	.string	"m14"
.LC766:
	.string	"m1v"
.LC767:
	.string	"video/mpeg"
.LC768:
	.string	"m21"
.LC769:
	.string	"application/mp21"
.LC770:
	.string	"m2a"
.LC771:
	.string	"audio/mpeg"
.LC772:
	.string	"m2v"
.LC773:
	.string	"m3a"
.LC774:
	.string	"m3u"
.LC775:
	.string	"audio/x-mpegurl"
.LC776:
	.string	"m3u8"
.LC777:
	.string	"application/vnd.apple.mpegurl"
.LC778:
	.string	"m4a"
.LC779:
	.string	"audio/mp4"
.LC780:
	.string	"m4b"
.LC781:
	.string	"m4r"
.LC782:
	.string	"m4u"
.LC783:
	.string	"video/vnd.mpegurl"
.LC784:
	.string	"m4v"
.LC785:
	.string	"video/mp4"
.LC786:
	.string	"ma"
.LC787:
	.string	"application/mathematica"
.LC788:
	.string	"mac"
.LC789:
	.string	"image/x-macpaint"
.LC790:
	.string	"mads"
.LC791:
	.string	"application/mads+xml"
.LC792:
	.string	"mag"
.LC793:
	.string	"application/vnd.ecowin.chart"
.LC794:
	.string	"maker"
.LC795:
	.string	"man"
.LC796:
	.string	"text/troff"
.LC797:
	.string	"mar"
.LC798:
	.string	"mathml"
.LC799:
	.string	"application/mathml+xml"
.LC800:
	.string	"mb"
.LC801:
	.string	"mbk"
.LC802:
	.string	"application/vnd.mobius.mbk"
.LC803:
	.string	"mbox"
.LC804:
	.string	"application/mbox"
.LC805:
	.string	"mc1"
.LC806:
	.string	"application/vnd.medcalcdata"
.LC807:
	.string	"mcd"
.LC808:
	.string	"application/vnd.mcd"
.LC809:
	.string	"mcurl"
.LC810:
	.string	"text/vnd.curl.mcurl"
.LC811:
	.string	"mdb"
.LC812:
	.string	"application/x-msaccess"
.LC813:
	.string	"mdi"
.LC814:
	.string	"image/vnd.ms-modi"
.LC815:
	.string	"me"
.LC816:
	.string	"mesh"
.LC817:
	.string	"model/mesh"
.LC818:
	.string	"meta4"
.LC819:
	.string	"application/metalink4+xml"
.LC820:
	.string	"metalink"
.LC821:
	.string	"application/metalink+xml"
.LC822:
	.string	"mets"
.LC823:
	.string	"application/mets+xml"
.LC824:
	.string	"mfm"
.LC825:
	.string	"application/vnd.mfmp"
.LC826:
	.string	"mft"
.LC827:
	.string	"application/rpki-manifest"
.LC828:
	.string	"mgp"
	.align 8
.LC829:
	.string	"application/vnd.osgeo.mapguide.package"
.LC830:
	.string	"mgz"
	.align 8
.LC831:
	.string	"application/vnd.proteus.magazine"
.LC832:
	.string	"mid"
.LC833:
	.string	"midi"
.LC834:
	.string	"mie"
.LC835:
	.string	"application/x-mie"
.LC836:
	.string	"mif"
.LC837:
	.string	"application/x-mif"
.LC838:
	.string	"mime"
.LC839:
	.string	"mj2"
.LC840:
	.string	"video/mj2"
.LC841:
	.string	"mjp2"
.LC842:
	.string	"mk3d"
.LC843:
	.string	"video/x-matroska"
.LC844:
	.string	"mka"
.LC845:
	.string	"audio/x-matroska"
.LC846:
	.string	"mks"
.LC847:
	.string	"mkv"
.LC848:
	.string	"mlp"
.LC849:
	.string	"application/vnd.dolby.mlp"
.LC850:
	.string	"mmd"
	.align 8
.LC851:
	.string	"application/vnd.chipnuts.karaoke-mmd"
.LC852:
	.string	"mmf"
.LC853:
	.string	"application/vnd.smaf"
.LC854:
	.string	"mmr"
	.align 8
.LC855:
	.string	"image/vnd.fujixerox.edmics-mmr"
.LC856:
	.string	"mng"
.LC857:
	.string	"video/x-mng"
.LC858:
	.string	"mny"
.LC859:
	.string	"application/x-msmoney"
.LC860:
	.string	"mobi"
	.align 8
.LC861:
	.string	"application/x-mobipocket-ebook"
.LC862:
	.string	"mods"
.LC863:
	.string	"application/mods+xml"
.LC864:
	.string	"mov"
.LC865:
	.string	"video/quicktime"
.LC866:
	.string	"movie"
.LC867:
	.string	"video/x-sgi-movie"
.LC868:
	.string	"mp1"
.LC869:
	.string	"mp2"
.LC870:
	.string	"mp21"
.LC871:
	.string	"mp2a"
.LC872:
	.string	"mp3"
.LC873:
	.string	"mp4"
.LC874:
	.string	"mp4a"
.LC875:
	.string	"mp4s"
.LC876:
	.string	"application/mp4"
.LC877:
	.string	"mp4v"
.LC878:
	.string	"mpa"
.LC879:
	.string	"mpc"
	.align 8
.LC880:
	.string	"application/vnd.mophun.certificate"
.LC881:
	.string	"mpe"
.LC882:
	.string	"mpeg"
.LC883:
	.string	"mpega"
.LC884:
	.string	"mpg"
.LC885:
	.string	"mpg4"
.LC886:
	.string	"mpga"
.LC887:
	.string	"mpkg"
	.align 8
.LC888:
	.string	"application/vnd.apple.installer+xml"
.LC889:
	.string	"mpm"
	.align 8
.LC890:
	.string	"application/vnd.blueice.multipass"
.LC891:
	.string	"mpn"
	.align 8
.LC892:
	.string	"application/vnd.mophun.application"
.LC893:
	.string	"mpp"
.LC894:
	.string	"application/vnd.ms-project"
.LC895:
	.string	"mpt"
.LC896:
	.string	"mpv2"
.LC897:
	.string	"video/mpeg2"
.LC898:
	.string	"mpy"
.LC899:
	.string	"application/vnd.ibm.minipay"
.LC900:
	.string	"mqy"
.LC901:
	.string	"application/vnd.mobius.mqy"
.LC902:
	.string	"mrc"
.LC903:
	.string	"application/marc"
.LC904:
	.string	"mrcx"
.LC905:
	.string	"application/marcxml+xml"
.LC906:
	.string	"ms"
.LC907:
	.string	"mscml"
	.align 8
.LC908:
	.string	"application/mediaservercontrol+xml"
.LC909:
	.string	"mseed"
.LC910:
	.string	"application/vnd.fdsn.mseed"
.LC911:
	.string	"mseq"
.LC912:
	.string	"application/vnd.mseq"
.LC913:
	.string	"msf"
.LC914:
	.string	"application/vnd.epson.msf"
.LC915:
	.string	"msh"
.LC916:
	.string	"msi"
.LC917:
	.string	"msl"
.LC918:
	.string	"application/vnd.mobius.msl"
.LC919:
	.string	"msty"
.LC920:
	.string	"application/vnd.muvee.style"
.LC921:
	.string	"mts"
.LC922:
	.string	"model/vnd.mts"
.LC923:
	.string	"mus"
.LC924:
	.string	"application/vnd.musician"
.LC925:
	.string	"musicxml"
	.align 8
.LC926:
	.string	"application/vnd.recordare.musicxml+xml"
.LC927:
	.string	"mvb"
.LC928:
	.string	"mwf"
.LC929:
	.string	"application/vnd.mfer"
.LC930:
	.string	"mxf"
.LC931:
	.string	"application/mxf"
.LC932:
	.string	"mxl"
	.align 8
.LC933:
	.string	"application/vnd.recordare.musicxml"
.LC934:
	.string	"mxml"
.LC935:
	.string	"application/xv+xml"
.LC936:
	.string	"mxs"
.LC937:
	.string	"application/vnd.triscape.mxs"
.LC938:
	.string	"mxu"
.LC939:
	.string	"n-gage"
	.align 8
.LC940:
	.string	"application/vnd.nokia.n-gage.symbian.install"
.LC941:
	.string	"n3"
.LC942:
	.string	"text/n3"
.LC943:
	.string	"nb"
.LC944:
	.string	"nbp"
	.align 8
.LC945:
	.string	"application/vnd.wolfram.player"
.LC946:
	.string	"nc"
.LC947:
	.string	"application/x-netcdf"
.LC948:
	.string	"ncx"
.LC949:
	.string	"application/x-dtbncx+xml"
.LC950:
	.string	"nfo"
.LC951:
	.string	"text/x-nfo"
.LC952:
	.string	"ngdat"
	.align 8
.LC953:
	.string	"application/vnd.nokia.n-gage.data"
.LC954:
	.string	"nitf"
.LC955:
	.string	"application/vnd.nitf"
.LC956:
	.string	"nlu"
	.align 8
.LC957:
	.string	"application/vnd.neurolanguage.nlu"
.LC958:
	.string	"nml"
.LC959:
	.string	"application/vnd.enliven"
.LC960:
	.string	"nnd"
	.align 8
.LC961:
	.string	"application/vnd.noblenet-directory"
.LC962:
	.string	"nns"
	.align 8
.LC963:
	.string	"application/vnd.noblenet-sealer"
.LC964:
	.string	"nnw"
.LC965:
	.string	"application/vnd.noblenet-web"
.LC966:
	.string	"npx"
.LC967:
	.string	"image/vnd.net-fpx"
.LC968:
	.string	"nsc"
.LC969:
	.string	"application/x-conference"
.LC970:
	.string	"nsf"
.LC971:
	.string	"application/vnd.lotus-notes"
.LC972:
	.string	"ntf"
.LC973:
	.string	"nzb"
.LC974:
	.string	"application/x-nzb"
.LC975:
	.string	"oa2"
	.align 8
.LC976:
	.string	"application/vnd.fujitsu.oasys2"
.LC977:
	.string	"oa3"
	.align 8
.LC978:
	.string	"application/vnd.fujitsu.oasys3"
.LC979:
	.string	"oas"
.LC980:
	.string	"application/vnd.fujitsu.oasys"
.LC981:
	.string	"obd"
.LC982:
	.string	"application/x-msbinder"
.LC983:
	.string	"obj"
.LC984:
	.string	"application/x-tgif"
.LC985:
	.string	"oda"
.LC986:
	.string	"application/oda"
.LC987:
	.string	" OpenDocument Database "
.LC988:
	.string	"odb"
.LC989:
	.string	" OpenDocument Chart "
.LC990:
	.string	"odc"
.LC991:
	.string	" OpenDocument Formula "
.LC992:
	.string	"odf"
.LC993:
	.string	"odft"
	.align 8
.LC994:
	.string	"application/vnd.oasis.opendocument.formula-template"
.LC995:
	.string	" OpenDocument Drawing "
.LC996:
	.string	"odg"
.LC997:
	.string	" OpenDocument Image "
.LC998:
	.string	"odi"
	.align 8
.LC999:
	.string	" OpenDocument Master Document "
.LC1000:
	.string	"odm"
.LC1001:
	.string	" OpenDocument Presentation "
.LC1002:
	.string	"odp"
.LC1003:
	.string	" OpenDocument Spreadsheet "
.LC1004:
	.string	"ods"
.LC1005:
	.string	" OpenDocument Text "
.LC1006:
	.string	"odt"
.LC1007:
	.string	"oga"
.LC1008:
	.string	"audio/ogg"
.LC1009:
	.string	"ogg"
.LC1010:
	.string	"ogv"
.LC1011:
	.string	"video/ogg"
.LC1012:
	.string	" xiph mime types "
.LC1013:
	.string	"ogx"
.LC1014:
	.string	"omdoc"
.LC1015:
	.string	"application/omdoc+xml"
.LC1016:
	.string	"onepkg"
.LC1017:
	.string	"application/onenote"
.LC1018:
	.string	"onetmp"
.LC1019:
	.string	"onetoc"
.LC1020:
	.string	"onetoc2"
.LC1021:
	.string	"opf"
.LC1022:
	.string	"application/oebps-package+xml"
.LC1023:
	.string	"opml"
.LC1024:
	.string	"text/x-opml"
.LC1025:
	.string	"oprc"
.LC1026:
	.string	"application/vnd.palm"
.LC1027:
	.string	"org"
	.align 8
.LC1028:
	.string	"application/vnd.lotus-organizer"
.LC1029:
	.string	"osf"
	.align 8
.LC1030:
	.string	"application/vnd.yamaha.openscoreformat"
.LC1031:
	.string	"osfpvg"
	.align 8
.LC1032:
	.string	"application/vnd.yamaha.openscoreformat.osfpvg+xml"
.LC1033:
	.string	"otc"
	.align 8
.LC1034:
	.string	"application/vnd.oasis.opendocument.chart-template"
.LC1035:
	.string	"otf"
.LC1036:
	.string	"font/otf"
	.align 8
.LC1037:
	.string	" OpenDocument Drawing Template "
.LC1038:
	.string	"otg"
.LC1039:
	.string	" HTML Document Template "
.LC1040:
	.string	"oth"
.LC1041:
	.string	"oti"
	.align 8
.LC1042:
	.string	"application/vnd.oasis.opendocument.image-template"
	.align 8
.LC1043:
	.string	" OpenDocument Presentation Template "
.LC1044:
	.string	"otp"
	.align 8
.LC1045:
	.string	" OpenDocument Spreadsheet Template "
.LC1046:
	.string	"ots"
.LC1047:
	.string	" OpenDocument Text Template "
.LC1048:
	.string	"ott"
.LC1049:
	.string	"oxps"
.LC1050:
	.string	"application/oxps"
.LC1051:
	.string	"oxt"
	.align 8
.LC1052:
	.string	"application/vnd.openofficeorg.extension"
.LC1053:
	.string	"p"
.LC1054:
	.string	"text/x-pascal"
.LC1055:
	.string	"p10"
.LC1056:
	.string	"application/pkcs10"
.LC1057:
	.string	"p12"
.LC1058:
	.string	"application/x-pkcs12"
.LC1059:
	.string	"p7b"
	.align 8
.LC1060:
	.string	"application/x-pkcs7-certificates"
.LC1061:
	.string	"p7c"
.LC1062:
	.string	"application/pkcs7-mime"
.LC1063:
	.string	"p7m"
.LC1064:
	.string	"p7r"
	.align 8
.LC1065:
	.string	"application/x-pkcs7-certreqresp"
.LC1066:
	.string	"p7s"
.LC1067:
	.string	"application/pkcs7-signature"
.LC1068:
	.string	"p8"
.LC1069:
	.string	"application/pkcs8"
.LC1070:
	.string	"pas"
.LC1071:
	.string	"paw"
.LC1072:
	.string	"application/vnd.pawaafile"
.LC1073:
	.string	"pbd"
.LC1074:
	.string	"application/vnd.powerbuilder6"
.LC1075:
	.string	"pbm"
.LC1076:
	.string	"image/x-portable-bitmap"
.LC1077:
	.string	"pcap"
.LC1078:
	.string	"pcf"
.LC1079:
	.string	"application/x-font-pcf"
.LC1080:
	.string	"pcl"
.LC1081:
	.string	"application/vnd.hp-pcl"
.LC1082:
	.string	"pclxl"
.LC1083:
	.string	"application/vnd.hp-pclxl"
.LC1084:
	.string	"pct"
.LC1085:
	.string	"image/pict"
.LC1086:
	.string	"pcurl"
.LC1087:
	.string	"application/vnd.curl.pcurl"
.LC1088:
	.string	"pcx"
.LC1089:
	.string	"image/x-pcx"
.LC1090:
	.string	"pdb"
.LC1091:
	.string	"pdf"
.LC1092:
	.string	"application/pdf"
.LC1093:
	.string	"pfa"
.LC1094:
	.string	"pfb"
.LC1095:
	.string	"pfm"
.LC1096:
	.string	"pfr"
.LC1097:
	.string	"application/font-tdpfr"
.LC1098:
	.string	"pfx"
.LC1099:
	.string	"pgm"
.LC1100:
	.string	"image/x-portable-graymap"
.LC1101:
	.string	"pgn"
.LC1102:
	.string	"application/x-chess-pgn"
.LC1103:
	.string	"pgp"
.LC1104:
	.string	"application/pgp-encrypted"
.LC1105:
	.string	"pic"
.LC1106:
	.string	"pict"
.LC1107:
	.string	"pkg"
.LC1108:
	.string	"pki"
.LC1109:
	.string	"application/pkixcmp"
.LC1110:
	.string	"pkipath"
.LC1111:
	.string	"application/pkix-pkipath"
.LC1112:
	.string	"plb"
	.align 8
.LC1113:
	.string	"application/vnd.3gpp.pic-bw-large"
.LC1114:
	.string	"plc"
.LC1115:
	.string	"application/vnd.mobius.plc"
.LC1116:
	.string	"plf"
.LC1117:
	.string	"application/vnd.pocketlearn"
.LC1118:
	.string	"pls"
.LC1119:
	.string	"audio/x-scpls"
.LC1120:
	.string	"pml"
.LC1121:
	.string	"application/vnd.ctc-posml"
.LC1122:
	.string	"png"
.LC1123:
	.string	"image/png"
.LC1124:
	.string	"pnm"
.LC1125:
	.string	"image/x-portable-anymap"
.LC1126:
	.string	"pnt"
.LC1127:
	.string	"portpkg"
	.align 8
.LC1128:
	.string	"application/vnd.macports.portpkg"
.LC1129:
	.string	"pot"
.LC1130:
	.string	"application/vnd.ms-powerpoint"
.LC1131:
	.string	"potm"
	.align 8
.LC1132:
	.string	"application/vnd.ms-powerpoint.template.macroenabled.12"
.LC1133:
	.string	"potx"
	.align 8
.LC1134:
	.string	"application/vnd.openxmlformats-officedocument.presentationml.template"
.LC1135:
	.string	"ppam"
	.align 8
.LC1136:
	.string	"application/vnd.ms-powerpoint.addin.macroenabled.12"
.LC1137:
	.string	"ppd"
.LC1138:
	.string	"application/vnd.cups-ppd"
.LC1139:
	.string	"ppm"
.LC1140:
	.string	"image/x-portable-pixmap"
.LC1141:
	.string	"pps"
.LC1142:
	.string	"ppsm"
	.align 8
.LC1143:
	.string	"application/vnd.ms-powerpoint.slideshow.macroenabled.12"
.LC1144:
	.string	"ppsx"
	.align 8
.LC1145:
	.string	"application/vnd.openxmlformats-officedocument.presentationml.slideshow"
.LC1146:
	.string	"ppt"
.LC1147:
	.string	"pptm"
	.align 8
.LC1148:
	.string	"application/vnd.ms-powerpoint.presentation.macroenabled.12"
.LC1149:
	.string	"pptx"
	.align 8
.LC1150:
	.string	"application/vnd.openxmlformats-officedocument.presentationml.presentation"
.LC1151:
	.string	"pqa"
.LC1152:
	.string	"prc"
.LC1153:
	.string	"pre"
	.align 8
.LC1154:
	.string	"application/vnd.lotus-freelance"
.LC1155:
	.string	"prf"
.LC1156:
	.string	"application/pics-rules"
.LC1157:
	.string	"ps"
.LC1158:
	.string	"psb"
	.align 8
.LC1159:
	.string	"application/vnd.3gpp.pic-bw-small"
.LC1160:
	.string	"psd"
.LC1161:
	.string	"image/vnd.adobe.photoshop"
.LC1162:
	.string	"psf"
.LC1163:
	.string	"application/x-font-linux-psf"
.LC1164:
	.string	"pskcxml"
.LC1165:
	.string	"application/pskc+xml"
.LC1166:
	.string	"ptid"
.LC1167:
	.string	"application/vnd.pvi.ptid1"
.LC1168:
	.string	"pub"
.LC1169:
	.string	"application/x-mspublisher"
.LC1170:
	.string	"pvb"
	.align 8
.LC1171:
	.string	"application/vnd.3gpp.pic-bw-let"
.LC1172:
	.string	"pwn"
	.align 8
.LC1173:
	.string	"application/vnd.3m.post-it-notes"
.LC1174:
	.string	"pya"
	.align 8
.LC1175:
	.string	"audio/vnd.ms-playready.media.pya"
.LC1176:
	.string	"pyv"
	.align 8
.LC1177:
	.string	"video/vnd.ms-playready.media.pyv"
.LC1178:
	.string	"qam"
	.align 8
.LC1179:
	.string	"application/vnd.epson.quickanime"
.LC1180:
	.string	"qbo"
.LC1181:
	.string	"application/vnd.intu.qbo"
.LC1182:
	.string	"qfx"
.LC1183:
	.string	"application/vnd.intu.qfx"
.LC1184:
	.string	"qps"
	.align 8
.LC1185:
	.string	"application/vnd.publishare-delta-tree"
.LC1186:
	.string	"qt"
.LC1187:
	.string	"qti"
.LC1188:
	.string	"image/x-quicktime"
.LC1189:
	.string	"qtif"
.LC1190:
	.string	"qwd"
	.align 8
.LC1191:
	.string	"application/vnd.quark.quarkxpress"
.LC1192:
	.string	"qwt"
.LC1193:
	.string	"qxb"
.LC1194:
	.string	"qxd"
.LC1195:
	.string	"qxl"
.LC1196:
	.string	"qxt"
.LC1197:
	.string	"ra"
.LC1198:
	.string	"audio/x-pn-realaudio"
.LC1199:
	.string	"ram"
.LC1200:
	.string	"rar"
.LC1201:
	.string	"application/x-rar-compressed"
.LC1202:
	.string	"ras"
.LC1203:
	.string	"image/x-cmu-raster"
.LC1204:
	.string	"rcprofile"
	.align 8
.LC1205:
	.string	"application/vnd.ipunplugged.rcprofile"
.LC1206:
	.string	"rdf"
.LC1207:
	.string	"application/rdf+xml"
.LC1208:
	.string	"rdz"
	.align 8
.LC1209:
	.string	"application/vnd.data-vision.rdz"
.LC1210:
	.string	"rep"
	.align 8
.LC1211:
	.string	"application/vnd.businessobjects"
.LC1212:
	.string	"res"
.LC1213:
	.string	"application/x-dtbresource+xml"
.LC1214:
	.string	"rgb"
.LC1215:
	.string	"image/x-rgb"
.LC1216:
	.string	"rif"
.LC1217:
	.string	"application/reginfo+xml"
.LC1218:
	.string	"rip"
.LC1219:
	.string	"audio/vnd.rip"
.LC1220:
	.string	"ris"
	.align 8
.LC1221:
	.string	"application/x-research-info-systems"
.LC1222:
	.string	"rl"
	.align 8
.LC1223:
	.string	"application/resource-lists+xml"
.LC1224:
	.string	"rlc"
	.align 8
.LC1225:
	.string	"image/vnd.fujixerox.edmics-rlc"
.LC1226:
	.string	"rld"
	.align 8
.LC1227:
	.string	"application/resource-lists-diff+xml"
.LC1228:
	.string	"rm"
.LC1229:
	.string	"application/vnd.rn-realmedia"
.LC1230:
	.string	"rmi"
.LC1231:
	.string	"rmp"
.LC1232:
	.string	"audio/x-pn-realaudio-plugin"
.LC1233:
	.string	"rms"
	.align 8
.LC1234:
	.string	"application/vnd.jcp.javame.midlet-rms"
.LC1235:
	.string	"rmvb"
	.align 8
.LC1236:
	.string	"application/vnd.rn-realmedia-vbr"
.LC1237:
	.string	"rnc"
	.align 8
.LC1238:
	.string	"application/relax-ng-compact-syntax"
.LC1239:
	.string	"roa"
.LC1240:
	.string	"application/rpki-roa"
.LC1241:
	.string	"roff"
.LC1242:
	.string	"rp9"
.LC1243:
	.string	"application/vnd.cloanto.rp9"
.LC1244:
	.string	"rpss"
	.align 8
.LC1245:
	.string	"application/vnd.nokia.radio-presets"
.LC1246:
	.string	"rpst"
	.align 8
.LC1247:
	.string	"application/vnd.nokia.radio-preset"
.LC1248:
	.string	"rq"
.LC1249:
	.string	"application/sparql-query"
.LC1250:
	.string	"rs"
.LC1251:
	.string	"application/rls-services+xml"
.LC1252:
	.string	"rsd"
.LC1253:
	.string	"application/rsd+xml"
.LC1254:
	.string	"rss"
.LC1255:
	.string	"application/rss+xml"
.LC1256:
	.string	"rtf"
.LC1257:
	.string	"application/rtf"
.LC1258:
	.string	"rtx"
.LC1259:
	.string	"text/richtext"
.LC1260:
	.string	"s"
.LC1261:
	.string	"s3m"
.LC1262:
	.string	"audio/s3m"
.LC1263:
	.string	"saf"
	.align 8
.LC1264:
	.string	"application/vnd.yamaha.smaf-audio"
.LC1265:
	.string	"sbml"
.LC1266:
	.string	"application/sbml+xml"
.LC1267:
	.string	"sc"
	.align 8
.LC1268:
	.string	"application/vnd.ibm.secure-container"
.LC1269:
	.string	"scd"
.LC1270:
	.string	"application/x-msschedule"
.LC1271:
	.string	"scm"
	.align 8
.LC1272:
	.string	"application/vnd.lotus-screencam"
.LC1273:
	.string	"scq"
.LC1274:
	.string	"application/scvp-cv-request"
.LC1275:
	.string	"scs"
.LC1276:
	.string	"application/scvp-cv-response"
.LC1277:
	.string	"scurl"
.LC1278:
	.string	"text/vnd.curl.scurl"
.LC1279:
	.string	"sda"
	.align 8
.LC1280:
	.string	"application/vnd.stardivision.draw"
.LC1281:
	.string	"sdc"
	.align 8
.LC1282:
	.string	"application/vnd.stardivision.calc"
.LC1283:
	.string	"sdd"
	.align 8
.LC1284:
	.string	"application/vnd.stardivision.impress"
.LC1285:
	.string	"sdkd"
	.align 8
.LC1286:
	.string	"application/vnd.solent.sdkm+xml"
.LC1287:
	.string	"sdkm"
.LC1288:
	.string	"sdp"
.LC1289:
	.string	"application/sdp"
.LC1290:
	.string	"sdw"
	.align 8
.LC1291:
	.string	"application/vnd.stardivision.writer"
.LC1292:
	.string	"see"
.LC1293:
	.string	"application/vnd.seemail"
.LC1294:
	.string	"seed"
.LC1295:
	.string	"sema"
.LC1296:
	.string	"application/vnd.sema"
.LC1297:
	.string	"semd"
.LC1298:
	.string	"application/vnd.semd"
.LC1299:
	.string	"semf"
.LC1300:
	.string	"application/vnd.semf"
.LC1301:
	.string	"ser"
	.align 8
.LC1302:
	.string	"application/java-serialized-object"
.LC1303:
	.string	"setpay"
	.align 8
.LC1304:
	.string	"application/set-payment-initiation"
.LC1305:
	.string	"setreg"
	.align 8
.LC1306:
	.string	"application/set-registration-initiation"
.LC1307:
	.string	"sfd-hdstx"
	.align 8
.LC1308:
	.string	"application/vnd.hydrostatix.sof-data"
.LC1309:
	.string	"sfs"
.LC1310:
	.string	"application/vnd.spotfire.sfs"
.LC1311:
	.string	"sfv"
.LC1312:
	.string	"text/x-sfv"
.LC1313:
	.string	"sgi"
.LC1314:
	.string	"image/sgi"
.LC1315:
	.string	"sgl"
	.align 8
.LC1316:
	.string	"application/vnd.stardivision.writer-global"
.LC1317:
	.string	"sgm"
.LC1318:
	.string	"text/sgml"
.LC1319:
	.string	"sgml"
.LC1320:
	.string	"sh"
.LC1321:
	.string	"application/x-sh"
.LC1322:
	.string	"shar"
.LC1323:
	.string	"application/x-shar"
.LC1324:
	.string	"shf"
.LC1325:
	.string	"application/shf+xml"
.LC1326:
	.string	"sid"
.LC1327:
	.string	"image/x-mrsid-image"
.LC1328:
	.string	"sig"
.LC1329:
	.string	"sil"
.LC1330:
	.string	"audio/silk"
.LC1331:
	.string	"silo"
.LC1332:
	.string	"sis"
	.align 8
.LC1333:
	.string	"application/vnd.symbian.install"
.LC1334:
	.string	"sisx"
.LC1335:
	.string	"sit"
.LC1336:
	.string	"application/x-stuffit"
.LC1337:
	.string	"sitx"
.LC1338:
	.string	"application/x-stuffitx"
.LC1339:
	.string	"skd"
.LC1340:
	.string	"application/vnd.koan"
.LC1341:
	.string	"skm"
.LC1342:
	.string	"skp"
.LC1343:
	.string	"skt"
.LC1344:
	.string	"sldm"
	.align 8
.LC1345:
	.string	"application/vnd.ms-powerpoint.slide.macroenabled.12"
.LC1346:
	.string	"sldx"
	.align 8
.LC1347:
	.string	"application/vnd.openxmlformats-officedocument.presentationml.slide"
.LC1348:
	.string	"slt"
.LC1349:
	.string	"application/vnd.epson.salt"
.LC1350:
	.string	"sm"
	.align 8
.LC1351:
	.string	"application/vnd.stepmania.stepchart"
.LC1352:
	.string	"smf"
	.align 8
.LC1353:
	.string	"application/vnd.stardivision.math"
.LC1354:
	.string	"smi"
.LC1355:
	.string	"application/smil+xml"
.LC1356:
	.string	"smil"
.LC1357:
	.string	"smv"
.LC1358:
	.string	"video/x-smv"
.LC1359:
	.string	"smzip"
	.align 8
.LC1360:
	.string	"application/vnd.stepmania.package"
.LC1361:
	.string	"snd"
.LC1362:
	.string	"snf"
.LC1363:
	.string	"application/x-font-snf"
.LC1364:
	.string	"so"
.LC1365:
	.string	"spc"
.LC1366:
	.string	"spf"
	.align 8
.LC1367:
	.string	"application/vnd.yamaha.smaf-phrase"
.LC1368:
	.string	"spl"
.LC1369:
	.string	"application/x-futuresplash"
.LC1370:
	.string	"spot"
.LC1371:
	.string	"text/vnd.in3d.spot"
.LC1372:
	.string	"spp"
.LC1373:
	.string	"application/scvp-vp-response"
.LC1374:
	.string	"spq"
.LC1375:
	.string	"application/scvp-vp-request"
.LC1376:
	.string	"spx"
.LC1377:
	.string	"sql"
.LC1378:
	.string	"application/x-sql"
.LC1379:
	.string	"src"
.LC1380:
	.string	"application/x-wais-source"
.LC1381:
	.string	"srt"
.LC1382:
	.string	"application/x-subrip"
.LC1383:
	.string	"sru"
.LC1384:
	.string	"application/sru+xml"
.LC1385:
	.string	"srx"
	.align 8
.LC1386:
	.string	"application/sparql-results+xml"
.LC1387:
	.string	"ssdl"
.LC1388:
	.string	"application/ssdl+xml"
.LC1389:
	.string	"sse"
	.align 8
.LC1390:
	.string	"application/vnd.kodak-descriptor"
.LC1391:
	.string	"ssf"
.LC1392:
	.string	"application/vnd.epson.ssf"
.LC1393:
	.string	"ssml"
.LC1394:
	.string	"application/ssml+xml"
.LC1395:
	.string	"st"
	.align 8
.LC1396:
	.string	"application/vnd.sailingtracker.track"
.LC1397:
	.string	"stc"
	.align 8
.LC1398:
	.string	"application/vnd.sun.xml.calc.template"
.LC1399:
	.string	"std"
	.align 8
.LC1400:
	.string	"application/vnd.sun.xml.draw.template"
.LC1401:
	.string	"stf"
.LC1402:
	.string	"application/vnd.wt.stf"
.LC1403:
	.string	"sti"
	.align 8
.LC1404:
	.string	"application/vnd.sun.xml.impress.template"
.LC1405:
	.string	"stk"
.LC1406:
	.string	"application/hyperstudio"
.LC1407:
	.string	"stl"
.LC1408:
	.string	"application/vnd.ms-pki.stl"
.LC1409:
	.string	"str"
.LC1410:
	.string	"application/vnd.pg.format"
.LC1411:
	.string	"stw"
	.align 8
.LC1412:
	.string	"application/vnd.sun.xml.writer.template"
.LC1413:
	.string	"sub"
.LC1414:
	.string	"text/vnd.dvb.subtitle"
.LC1415:
	.string	"sus"
.LC1416:
	.string	"application/vnd.sus-calendar"
.LC1417:
	.string	"susp"
.LC1418:
	.string	"sv4cpio"
.LC1419:
	.string	"application/x-sv4cpio"
.LC1420:
	.string	"sv4crc"
.LC1421:
	.string	"application/x-sv4crc"
.LC1422:
	.string	"svc"
.LC1423:
	.string	"application/vnd.dvb.service"
.LC1424:
	.string	"svd"
.LC1425:
	.string	"application/vnd.svd"
.LC1426:
	.string	"svg"
.LC1427:
	.string	"image/svg+xml"
.LC1428:
	.string	"svgz"
.LC1429:
	.string	"swa"
.LC1430:
	.string	"swf"
.LC1431:
	.string	"application/x-shockwave-flash"
.LC1432:
	.string	"swi"
	.align 8
.LC1433:
	.string	"application/vnd.aristanetworks.swi"
.LC1434:
	.string	"sxc"
.LC1435:
	.string	"application/vnd.sun.xml.calc"
.LC1436:
	.string	"sxd"
.LC1437:
	.string	"application/vnd.sun.xml.draw"
.LC1438:
	.string	"sxg"
	.align 8
.LC1439:
	.string	"application/vnd.sun.xml.writer.global"
.LC1440:
	.string	"sxi"
	.align 8
.LC1441:
	.string	"application/vnd.sun.xml.impress"
.LC1442:
	.string	"sxm"
.LC1443:
	.string	"application/vnd.sun.xml.math"
.LC1444:
	.string	"sxw"
	.align 8
.LC1445:
	.string	"application/vnd.sun.xml.writer"
.LC1446:
	.string	"t"
.LC1447:
	.string	"t3"
.LC1448:
	.string	"application/x-t3vm-image"
.LC1449:
	.string	"taglet"
.LC1450:
	.string	"application/vnd.mynfc"
.LC1451:
	.string	"tao"
	.align 8
.LC1452:
	.string	"application/vnd.tao.intent-module-archive"
.LC1453:
	.string	"tar"
.LC1454:
	.string	"application/x-tar"
.LC1455:
	.string	"tcap"
.LC1456:
	.string	"application/vnd.3gpp2.tcap"
.LC1457:
	.string	"tcl"
.LC1458:
	.string	"application/x-tcl"
.LC1459:
	.string	"teacher"
.LC1460:
	.string	"application/vnd.smart.teacher"
.LC1461:
	.string	"tei"
.LC1462:
	.string	"application/tei+xml"
.LC1463:
	.string	"teicorpus"
.LC1464:
	.string	"tex"
.LC1465:
	.string	"application/x-tex"
.LC1466:
	.string	"texi"
.LC1467:
	.string	"application/x-texinfo"
.LC1468:
	.string	"texinfo"
.LC1469:
	.string	"text"
.LC1470:
	.string	"tfi"
.LC1471:
	.string	"application/thraud+xml"
.LC1472:
	.string	"tfm"
.LC1473:
	.string	"application/x-tex-tfm"
.LC1474:
	.string	"tga"
.LC1475:
	.string	"image/x-tga"
.LC1476:
	.string	"thmx"
	.align 8
.LC1477:
	.string	"application/vnd.ms-officetheme"
.LC1478:
	.string	"tif"
.LC1479:
	.string	"image/tiff"
.LC1480:
	.string	"tiff"
.LC1481:
	.string	"tmo"
	.align 8
.LC1482:
	.string	"application/vnd.tmobile-livetv"
.LC1483:
	.string	"torrent"
.LC1484:
	.string	"application/x-bittorrent"
.LC1485:
	.string	"tpl"
	.align 8
.LC1486:
	.string	"application/vnd.groove-tool-template"
.LC1487:
	.string	"tpt"
.LC1488:
	.string	"application/vnd.trid.tpt"
.LC1489:
	.string	"tr"
.LC1490:
	.string	"tra"
.LC1491:
	.string	"application/vnd.trueapp"
.LC1492:
	.string	"trm"
.LC1493:
	.string	"application/x-msterminal"
.LC1494:
	.string	"tsd"
.LC1495:
	.string	"application/timestamped-data"
.LC1496:
	.string	"tsv"
.LC1497:
	.string	"text/tab-separated-values"
.LC1498:
	.string	"ttc"
.LC1499:
	.string	"font/collection"
.LC1500:
	.string	"ttf"
.LC1501:
	.string	"font/ttf"
.LC1502:
	.string	"ttl"
.LC1503:
	.string	"text/turtle"
.LC1504:
	.string	"twd"
	.align 8
.LC1505:
	.string	"application/vnd.simtech-mindmapper"
.LC1506:
	.string	"twds"
.LC1507:
	.string	"txd"
	.align 8
.LC1508:
	.string	"application/vnd.genomatix.tuxedo"
.LC1509:
	.string	"txf"
.LC1510:
	.string	"application/vnd.mobius.txf"
.LC1511:
	.string	"txt"
.LC1512:
	.string	"u32"
.LC1513:
	.string	"udeb"
.LC1514:
	.string	"ufd"
.LC1515:
	.string	"application/vnd.ufdl"
.LC1516:
	.string	"ufdl"
.LC1517:
	.string	"ulw"
.LC1518:
	.string	"ulx"
.LC1519:
	.string	"application/x-glulx"
.LC1520:
	.string	"umj"
.LC1521:
	.string	"application/vnd.umajin"
.LC1522:
	.string	"unityweb"
.LC1523:
	.string	"application/vnd.unity"
.LC1524:
	.string	"uoml"
.LC1525:
	.string	"application/vnd.uoml+xml"
.LC1526:
	.string	"uri"
.LC1527:
	.string	"text/uri-list"
.LC1528:
	.string	"uris"
.LC1529:
	.string	"urls"
.LC1530:
	.string	"ustar"
.LC1531:
	.string	"application/x-ustar"
.LC1532:
	.string	"utz"
.LC1533:
	.string	"application/vnd.uiq.theme"
.LC1534:
	.string	"uu"
.LC1535:
	.string	"text/x-uuencode"
.LC1536:
	.string	"uva"
.LC1537:
	.string	"audio/vnd.dece.audio"
.LC1538:
	.string	"uvd"
.LC1539:
	.string	"application/vnd.dece.data"
.LC1540:
	.string	"uvf"
.LC1541:
	.string	"uvg"
.LC1542:
	.string	"image/vnd.dece.graphic"
.LC1543:
	.string	"uvh"
.LC1544:
	.string	"video/vnd.dece.hd"
.LC1545:
	.string	"uvi"
.LC1546:
	.string	"uvm"
.LC1547:
	.string	"video/vnd.dece.mobile"
.LC1548:
	.string	"uvp"
.LC1549:
	.string	"video/vnd.dece.pd"
.LC1550:
	.string	"uvs"
.LC1551:
	.string	"video/vnd.dece.sd"
.LC1552:
	.string	"uvt"
.LC1553:
	.string	"application/vnd.dece.ttml+xml"
.LC1554:
	.string	"uvu"
.LC1555:
	.string	"video/vnd.uvvu.mp4"
.LC1556:
	.string	"uvv"
.LC1557:
	.string	"video/vnd.dece.video"
.LC1558:
	.string	"uvva"
.LC1559:
	.string	"uvvd"
.LC1560:
	.string	"uvvf"
.LC1561:
	.string	"uvvg"
.LC1562:
	.string	"uvvh"
.LC1563:
	.string	"uvvi"
.LC1564:
	.string	"uvvm"
.LC1565:
	.string	"uvvp"
.LC1566:
	.string	"uvvs"
.LC1567:
	.string	"uvvt"
.LC1568:
	.string	"uvvu"
.LC1569:
	.string	"uvvv"
.LC1570:
	.string	"uvvx"
	.align 8
.LC1571:
	.string	"application/vnd.dece.unspecified"
.LC1572:
	.string	"uvvz"
.LC1573:
	.string	"application/vnd.dece.zip"
.LC1574:
	.string	"uvx"
.LC1575:
	.string	"uvz"
.LC1576:
	.string	"vcard"
.LC1577:
	.string	"text/vcard"
.LC1578:
	.string	"vcd"
.LC1579:
	.string	"application/x-cdlink"
.LC1580:
	.string	"vcf"
.LC1581:
	.string	"text/x-vcard"
.LC1582:
	.string	"vcg"
.LC1583:
	.string	"application/vnd.groove-vcard"
.LC1584:
	.string	"vcs"
.LC1585:
	.string	"text/x-vcalendar"
.LC1586:
	.string	"vcx"
.LC1587:
	.string	"application/vnd.vcx"
.LC1588:
	.string	"vis"
.LC1589:
	.string	"application/vnd.visionary"
.LC1590:
	.string	"viv"
.LC1591:
	.string	"video/vnd.vivo"
.LC1592:
	.string	"vob"
.LC1593:
	.string	"video/x-ms-vob"
.LC1594:
	.string	"vor"
.LC1595:
	.string	"vox"
.LC1596:
	.string	"vrml"
.LC1597:
	.string	"model/vrml"
.LC1598:
	.string	"vsd"
.LC1599:
	.string	"application/vnd.visio"
.LC1600:
	.string	"vsf"
.LC1601:
	.string	"application/vnd.vsf"
.LC1602:
	.string	"vss"
.LC1603:
	.string	"vst"
.LC1604:
	.string	"vsw"
.LC1605:
	.string	"vtu"
.LC1606:
	.string	"model/vnd.vtu"
.LC1607:
	.string	"vxml"
.LC1608:
	.string	"application/voicexml+xml"
.LC1609:
	.string	"w3d"
.LC1610:
	.string	"wad"
.LC1611:
	.string	"application/x-doom"
.LC1612:
	.string	"wav"
.LC1613:
	.string	"audio/x-wav"
.LC1614:
	.string	"wax"
.LC1615:
	.string	"audio/x-ms-wax"
.LC1616:
	.string	" Wireless Bitmap "
.LC1617:
	.string	"wbmp"
.LC1618:
	.string	"wbs"
	.align 8
.LC1619:
	.string	"application/vnd.criticaltools.wbs+xml"
.LC1620:
	.string	"wbxml"
.LC1621:
	.string	"application/vnd.wap.wbxml"
.LC1622:
	.string	"wcm"
.LC1623:
	.string	"application/vnd.ms-works"
.LC1624:
	.string	"wdb"
.LC1625:
	.string	"wdp"
.LC1626:
	.string	"image/vnd.ms-photo"
.LC1627:
	.string	"weba"
.LC1628:
	.string	"audio/webm"
.LC1629:
	.string	"webm"
.LC1630:
	.string	"video/webm"
.LC1631:
	.string	"webp"
.LC1632:
	.string	"image/webp"
.LC1633:
	.string	"wg"
.LC1634:
	.string	"application/vnd.pmi.widget"
.LC1635:
	.string	"wgt"
.LC1636:
	.string	"application/widget"
.LC1637:
	.string	"wks"
.LC1638:
	.string	"wm"
.LC1639:
	.string	"video/x-ms-wm"
.LC1640:
	.string	"wma"
.LC1641:
	.string	"audio/x-ms-wma"
.LC1642:
	.string	"wmd"
.LC1643:
	.string	"application/x-ms-wmd"
.LC1644:
	.string	"wmf"
.LC1645:
	.string	" WML Source "
.LC1646:
	.string	"wml"
.LC1647:
	.string	" Compiled WML "
.LC1648:
	.string	"wmlc"
.LC1649:
	.string	" WML Script Source "
.LC1650:
	.string	"wmls"
.LC1651:
	.string	" Compiled WML Script "
.LC1652:
	.string	"wmlsc"
.LC1653:
	.string	"wmv"
.LC1654:
	.string	"video/x-ms-wmv"
.LC1655:
	.string	"wmx"
.LC1656:
	.string	"video/x-ms-wmx"
.LC1657:
	.string	"wmz"
.LC1658:
	.string	"woff"
.LC1659:
	.string	"font/woff"
.LC1660:
	.string	"woff2"
.LC1661:
	.string	"font/woff2"
.LC1662:
	.string	"wpd"
.LC1663:
	.string	"application/vnd.wordperfect"
.LC1664:
	.string	"wpl"
.LC1665:
	.string	"application/vnd.ms-wpl"
.LC1666:
	.string	"wps"
.LC1667:
	.string	"wqd"
.LC1668:
	.string	"application/vnd.wqd"
.LC1669:
	.string	"wri"
.LC1670:
	.string	"application/x-mswrite"
.LC1671:
	.string	"wrl"
.LC1672:
	.string	"wsdl"
.LC1673:
	.string	"application/wsdl+xml"
.LC1674:
	.string	"wspolicy"
.LC1675:
	.string	"application/wspolicy+xml"
.LC1676:
	.string	"wtb"
.LC1677:
	.string	"application/vnd.webturbo"
.LC1678:
	.string	"wvx"
.LC1679:
	.string	"video/x-ms-wvx"
.LC1680:
	.string	"x32"
.LC1681:
	.string	"x3d"
.LC1682:
	.string	"model/x3d+xml"
.LC1683:
	.string	"x3db"
.LC1684:
	.string	"model/x3d+binary"
.LC1685:
	.string	"x3dbz"
.LC1686:
	.string	"x3dv"
.LC1687:
	.string	"model/x3d+vrml"
.LC1688:
	.string	"x3dvz"
.LC1689:
	.string	"x3dz"
.LC1690:
	.string	"xaml"
.LC1691:
	.string	"application/xaml+xml"
.LC1692:
	.string	"xap"
.LC1693:
	.string	"application/x-silverlight-app"
.LC1694:
	.string	"xar"
.LC1695:
	.string	"application/vnd.xara"
.LC1696:
	.string	"xbap"
.LC1697:
	.string	"application/x-ms-xbap"
.LC1698:
	.string	"xbd"
	.align 8
.LC1699:
	.string	"application/vnd.fujixerox.docuworks.binder"
.LC1700:
	.string	"xbm"
.LC1701:
	.string	"image/x-xbitmap"
.LC1702:
	.string	"xdf"
.LC1703:
	.string	"application/xcap-diff+xml"
.LC1704:
	.string	"xdm"
.LC1705:
	.string	"application/vnd.syncml.dm+xml"
.LC1706:
	.string	"xdp"
.LC1707:
	.string	"application/vnd.adobe.xdp+xml"
.LC1708:
	.string	"xdssc"
.LC1709:
	.string	"application/dssc+xml"
.LC1710:
	.string	"xdw"
	.align 8
.LC1711:
	.string	"application/vnd.fujixerox.docuworks"
.LC1712:
	.string	"xenc"
.LC1713:
	.string	"application/xenc+xml"
.LC1714:
	.string	"xer"
	.align 8
.LC1715:
	.string	"application/patch-ops-error+xml"
.LC1716:
	.string	"xfdf"
.LC1717:
	.string	"application/vnd.adobe.xfdf"
.LC1718:
	.string	"xfdl"
.LC1719:
	.string	"application/vnd.xfdl"
.LC1720:
	.string	"xht"
.LC1721:
	.string	"application/xhtml+xml"
.LC1722:
	.string	"xhtml"
.LC1723:
	.string	"xhvml"
.LC1724:
	.string	"xif"
.LC1725:
	.string	"image/vnd.xiff"
.LC1726:
	.string	"xla"
.LC1727:
	.string	"application/vnd.ms-excel"
.LC1728:
	.string	"xlam"
	.align 8
.LC1729:
	.string	"application/vnd.ms-excel.addin.macroenabled.12"
.LC1730:
	.string	"xlc"
.LC1731:
	.string	"xlf"
.LC1732:
	.string	"application/x-xliff+xml"
.LC1733:
	.string	"xlm"
.LC1734:
	.string	"xls"
.LC1735:
	.string	"xlsb"
	.align 8
.LC1736:
	.string	"application/vnd.ms-excel.sheet.binary.macroenabled.12"
.LC1737:
	.string	"xlsm"
	.align 8
.LC1738:
	.string	"application/vnd.ms-excel.sheet.macroenabled.12"
.LC1739:
	.string	"xlsx"
	.align 8
.LC1740:
	.string	"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
.LC1741:
	.string	"xlt"
.LC1742:
	.string	"xltm"
	.align 8
.LC1743:
	.string	"application/vnd.ms-excel.template.macroenabled.12"
.LC1744:
	.string	"xltx"
	.align 8
.LC1745:
	.string	"application/vnd.openxmlformats-officedocument.spreadsheetml.template"
.LC1746:
	.string	"xlw"
.LC1747:
	.string	"xm"
.LC1748:
	.string	"audio/xm"
.LC1749:
	.string	"xml"
.LC1750:
	.string	"application/xml"
.LC1751:
	.string	"xo"
.LC1752:
	.string	"application/vnd.olpc-sugar"
.LC1753:
	.string	"xop"
.LC1754:
	.string	"application/xop+xml"
.LC1755:
	.string	"xpi"
.LC1756:
	.string	"application/x-xpinstall"
.LC1757:
	.string	"xpl"
.LC1758:
	.string	"application/xproc+xml"
.LC1759:
	.string	"xpm"
.LC1760:
	.string	"image/x-xpixmap"
.LC1761:
	.string	"xpr"
.LC1762:
	.string	"application/vnd.is-xpr"
.LC1763:
	.string	"xps"
	.align 8
.LC1764:
	.string	"application/vnd.ms-xpsdocument"
.LC1765:
	.string	"xpw"
	.align 8
.LC1766:
	.string	"application/vnd.intercon.formnet"
.LC1767:
	.string	"xpx"
.LC1768:
	.string	"xsl"
.LC1769:
	.string	"xslt"
.LC1770:
	.string	"application/xslt+xml"
.LC1771:
	.string	"xsm"
.LC1772:
	.string	"application/vnd.syncml+xml"
.LC1773:
	.string	"xspf"
.LC1774:
	.string	"application/xspf+xml"
.LC1775:
	.string	"xul"
	.align 8
.LC1776:
	.string	"application/vnd.mozilla.xul+xml"
.LC1777:
	.string	"xvm"
.LC1778:
	.string	"xvml"
.LC1779:
	.string	"xwd"
.LC1780:
	.string	"image/x-xwindowdump"
.LC1781:
	.string	"xyz"
.LC1782:
	.string	"chemical/x-xyz"
.LC1783:
	.string	"xz"
.LC1784:
	.string	"application/x-xz"
.LC1785:
	.string	"yang"
.LC1786:
	.string	"application/yang"
.LC1787:
	.string	"yin"
.LC1788:
	.string	"application/yin+xml"
.LC1789:
	.string	"z"
.LC1790:
	.string	"application/x-compress"
.LC1791:
	.string	"z1"
.LC1792:
	.string	"application/x-zmachine"
.LC1793:
	.string	"z2"
.LC1794:
	.string	"z3"
.LC1795:
	.string	"z4"
.LC1796:
	.string	"z5"
.LC1797:
	.string	"z6"
.LC1798:
	.string	"z7"
.LC1799:
	.string	"z8"
.LC1800:
	.string	"zaz"
	.align 8
.LC1801:
	.string	"application/vnd.zzazz.deck+xml"
.LC1802:
	.string	"zip"
.LC1803:
	.string	"application/zip"
.LC1804:
	.string	"zir"
.LC1805:
	.string	"application/vnd.zul"
.LC1806:
	.string	"zirz"
.LC1807:
	.string	"zmm"
	.align 8
.LC1808:
	.string	"application/vnd.handheld-entertainment+xml"
	.section	.data.rel.local
	.align 32
	.type	MIME_MAPPING, @object
	.size	MIME_MAPPING, 16160
MIME_MAPPING:
	.quad	.LC20
	.quad	.LC21
	.quad	.LC22
	.quad	.LC23
	.quad	.LC24
	.quad	.LC25
	.quad	.LC26
	.quad	.LC27
	.quad	.LC28
	.quad	.LC29
	.quad	.LC30
	.quad	.LC31
	.quad	.LC32
	.quad	.LC33
	.quad	.LC34
	.quad	.LC35
	.quad	.LC36
	.quad	.LC37
	.quad	.LC38
	.quad	.LC39
	.quad	.LC40
	.quad	.LC41
	.quad	.LC42
	.quad	.LC43
	.quad	.LC44
	.quad	.LC45
	.quad	.LC46
	.quad	.LC47
	.quad	.LC48
	.quad	.LC49
	.quad	.LC50
	.quad	.LC51
	.quad	.LC52
	.quad	.LC53
	.quad	.LC54
	.quad	.LC55
	.quad	.LC56
	.quad	.LC57
	.quad	.LC58
	.quad	.LC59
	.quad	.LC60
	.quad	.LC61
	.quad	.LC62
	.quad	.LC63
	.quad	.LC64
	.quad	.LC65
	.quad	.LC66
	.quad	.LC67
	.quad	.LC68
	.quad	.LC67
	.quad	.LC69
	.quad	.LC67
	.quad	.LC70
	.quad	.LC71
	.quad	.LC72
	.quad	.LC73
	.quad	.LC74
	.quad	.LC75
	.quad	.LC76
	.quad	.LC77
	.quad	.LC78
	.quad	.LC79
	.quad	.LC80
	.quad	.LC81
	.quad	.LC82
	.quad	.LC83
	.quad	.LC84
	.quad	.LC85
	.quad	.LC86
	.quad	.LC87
	.quad	.LC88
	.quad	.LC89
	.quad	.LC90
	.quad	.LC91
	.quad	.LC92
	.quad	.LC93
	.quad	.LC94
	.quad	.LC95
	.quad	.LC96
	.quad	.LC97
	.quad	.LC98
	.quad	.LC99
	.quad	.LC100
	.quad	.LC95
	.quad	.LC101
	.quad	.LC53
	.quad	.LC102
	.quad	.LC103
	.quad	.LC104
	.quad	.LC105
	.quad	.LC106
	.quad	.LC107
	.quad	.LC108
	.quad	.LC109
	.quad	.LC110
	.quad	.LC111
	.quad	.LC112
	.quad	.LC113
	.quad	.LC114
	.quad	.LC115
	.quad	.LC116
	.quad	.LC117
	.quad	.LC118
	.quad	.LC119
	.quad	.LC120
	.quad	.LC121
	.quad	.LC122
	.quad	.LC123
	.quad	.LC124
	.quad	.LC125
	.quad	.LC126
	.quad	.LC127
	.quad	.LC128
	.quad	.LC129
	.quad	.LC130
	.quad	.LC131
	.quad	.LC132
	.quad	.LC133
	.quad	.LC134
	.quad	.LC135
	.quad	.LC136
	.quad	.LC137
	.quad	.LC138
	.quad	.LC139
	.quad	.LC140
	.quad	.LC141
	.quad	.LC142
	.quad	.LC143
	.quad	.LC144
	.quad	.LC143
	.quad	.LC145
	.quad	.LC146
	.quad	.LC147
	.quad	.LC148
	.quad	.LC149
	.quad	.LC150
	.quad	.LC151
	.quad	.LC152
	.quad	.LC153
	.quad	.LC154
	.quad	.LC155
	.quad	.LC156
	.quad	.LC157
	.quad	.LC141
	.quad	.LC158
	.quad	.LC159
	.quad	.LC160
	.quad	.LC161
	.quad	.LC162
	.quad	.LC156
	.quad	.LC163
	.quad	.LC164
	.quad	.LC165
	.quad	.LC166
	.quad	.LC167
	.quad	.LC168
	.quad	.LC169
	.quad	.LC170
	.quad	.LC171
	.quad	.LC170
	.quad	.LC172
	.quad	.LC170
	.quad	.LC173
	.quad	.LC170
	.quad	.LC174
	.quad	.LC170
	.quad	.LC175
	.quad	.LC176
	.quad	.LC177
	.quad	.LC178
	.quad	.LC179
	.quad	.LC180
	.quad	.LC181
	.quad	.LC182
	.quad	.LC183
	.quad	.LC184
	.quad	.LC185
	.quad	.LC186
	.quad	.LC187
	.quad	.LC186
	.quad	.LC188
	.quad	.LC186
	.quad	.LC189
	.quad	.LC186
	.quad	.LC190
	.quad	.LC186
	.quad	.LC191
	.quad	.LC164
	.quad	.LC192
	.quad	.LC193
	.quad	.LC194
	.quad	.LC195
	.quad	.LC196
	.quad	.LC197
	.quad	.LC198
	.quad	.LC199
	.quad	.LC200
	.quad	.LC201
	.quad	.LC202
	.quad	.LC203
	.quad	.LC204
	.quad	.LC205
	.quad	.LC206
	.quad	.LC207
	.quad	.LC208
	.quad	.LC209
	.quad	.LC210
	.quad	.LC211
	.quad	.LC212
	.quad	.LC213
	.quad	.LC214
	.quad	.LC215
	.quad	.LC216
	.quad	.LC217
	.quad	.LC218
	.quad	.LC219
	.quad	.LC220
	.quad	.LC221
	.quad	.LC222
	.quad	.LC223
	.quad	.LC224
	.quad	.LC225
	.quad	.LC226
	.quad	.LC227
	.quad	.LC228
	.quad	.LC229
	.quad	.LC230
	.quad	.LC231
	.quad	.LC232
	.quad	.LC233
	.quad	.LC234
	.quad	.LC235
	.quad	.LC236
	.quad	.LC237
	.quad	.LC238
	.quad	.LC239
	.quad	.LC240
	.quad	.LC241
	.quad	.LC242
	.quad	.LC243
	.quad	.LC244
	.quad	.LC245
	.quad	.LC246
	.quad	.LC247
	.quad	.LC248
	.quad	.LC249
	.quad	.LC250
	.quad	.LC251
	.quad	.LC252
	.quad	.LC253
	.quad	.LC254
	.quad	.LC255
	.quad	.LC256
	.quad	.LC257
	.quad	.LC258
	.quad	.LC259
	.quad	.LC260
	.quad	.LC261
	.quad	.LC262
	.quad	.LC263
	.quad	.LC264
	.quad	.LC129
	.quad	.LC265
	.quad	.LC266
	.quad	.LC267
	.quad	.LC268
	.quad	.LC269
	.quad	.LC164
	.quad	.LC270
	.quad	.LC271
	.quad	.LC272
	.quad	.LC273
	.quad	.LC274
	.quad	.LC275
	.quad	.LC276
	.quad	.LC277
	.quad	.LC278
	.quad	.LC279
	.quad	.LC280
	.quad	.LC281
	.quad	.LC282
	.quad	.LC283
	.quad	.LC284
	.quad	.LC285
	.quad	.LC286
	.quad	.LC287
	.quad	.LC288
	.quad	.LC193
	.quad	.LC289
	.quad	.LC290
	.quad	.LC291
	.quad	.LC292
	.quad	.LC293
	.quad	.LC294
	.quad	.LC295
	.quad	.LC296
	.quad	.LC297
	.quad	.LC193
	.quad	.LC298
	.quad	.LC164
	.quad	.LC299
	.quad	.LC300
	.quad	.LC301
	.quad	.LC302
	.quad	.LC303
	.quad	.LC304
	.quad	.LC305
	.quad	.LC306
	.quad	.LC307
	.quad	.LC308
	.quad	.LC309
	.quad	.LC310
	.quad	.LC311
	.quad	.LC193
	.quad	.LC312
	.quad	.LC313
	.quad	.LC314
	.quad	.LC315
	.quad	.LC316
	.quad	.LC317
	.quad	.LC318
	.quad	.LC319
	.quad	.LC320
	.quad	.LC266
	.quad	.LC321
	.quad	.LC141
	.quad	.LC322
	.quad	.LC277
	.quad	.LC323
	.quad	.LC324
	.quad	.LC325
	.quad	.LC326
	.quad	.LC327
	.quad	.LC148
	.quad	.LC328
	.quad	.LC164
	.quad	.LC329
	.quad	.LC193
	.quad	.LC330
	.quad	.LC331
	.quad	.LC332
	.quad	.LC141
	.quad	.LC333
	.quad	.LC141
	.quad	.LC334
	.quad	.LC335
	.quad	.LC336
	.quad	.LC335
	.quad	.LC337
	.quad	.LC129
	.quad	.LC338
	.quad	.LC339
	.quad	.LC340
	.quad	.LC180
	.quad	.LC341
	.quad	.LC141
	.quad	.LC342
	.quad	.LC343
	.quad	.LC344
	.quad	.LC345
	.quad	.LC346
	.quad	.LC347
	.quad	.LC348
	.quad	.LC349
	.quad	.LC350
	.quad	.LC345
	.quad	.LC351
	.quad	.LC352
	.quad	.LC353
	.quad	.LC354
	.quad	.LC355
	.quad	.LC356
	.quad	.LC357
	.quad	.LC358
	.quad	.LC359
	.quad	.LC360
	.quad	.LC361
	.quad	.LC362
	.quad	.LC363
	.quad	.LC364
	.quad	.LC365
	.quad	.LC366
	.quad	.LC367
	.quad	.LC368
	.quad	.LC369
	.quad	.LC370
	.quad	.LC371
	.quad	.LC372
	.quad	.LC373
	.quad	.LC141
	.quad	.LC374
	.quad	.LC375
	.quad	.LC376
	.quad	.LC377
	.quad	.LC378
	.quad	.LC379
	.quad	.LC380
	.quad	.LC381
	.quad	.LC382
	.quad	.LC383
	.quad	.LC384
	.quad	.LC385
	.quad	.LC386
	.quad	.LC387
	.quad	.LC388
	.quad	.LC193
	.quad	.LC389
	.quad	.LC390
	.quad	.LC391
	.quad	.LC392
	.quad	.LC393
	.quad	.LC394
	.quad	.LC395
	.quad	.LC396
	.quad	.LC397
	.quad	.LC398
	.quad	.LC399
	.quad	.LC400
	.quad	.LC401
	.quad	.LC402
	.quad	.LC403
	.quad	.LC404
	.quad	.LC405
	.quad	.LC141
	.quad	.LC406
	.quad	.LC407
	.quad	.LC408
	.quad	.LC409
	.quad	.LC410
	.quad	.LC411
	.quad	.LC412
	.quad	.LC407
	.quad	.LC413
	.quad	.LC414
	.quad	.LC415
	.quad	.LC416
	.quad	.LC417
	.quad	.LC65
	.quad	.LC418
	.quad	.LC419
	.quad	.LC420
	.quad	.LC421
	.quad	.LC422
	.quad	.LC423
	.quad	.LC424
	.quad	.LC425
	.quad	.LC426
	.quad	.LC421
	.quad	.LC427
	.quad	.LC428
	.quad	.LC429
	.quad	.LC430
	.quad	.LC431
	.quad	.LC432
	.quad	.LC433
	.quad	.LC141
	.quad	.LC434
	.quad	.LC435
	.quad	.LC436
	.quad	.LC437
	.quad	.LC438
	.quad	.LC439
	.quad	.LC440
	.quad	.LC441
	.quad	.LC442
	.quad	.LC443
	.quad	.LC444
	.quad	.LC445
	.quad	.LC446
	.quad	.LC447
	.quad	.LC448
	.quad	.LC445
	.quad	.LC449
	.quad	.LC445
	.quad	.LC450
	.quad	.LC451
	.quad	.LC452
	.quad	.LC453
	.quad	.LC454
	.quad	.LC455
	.quad	.LC456
	.quad	.LC457
	.quad	.LC458
	.quad	.LC459
	.quad	.LC460
	.quad	.LC461
	.quad	.LC462
	.quad	.LC193
	.quad	.LC463
	.quad	.LC464
	.quad	.LC465
	.quad	.LC464
	.quad	.LC466
	.quad	.LC464
	.quad	.LC467
	.quad	.LC464
	.quad	.LC468
	.quad	.LC464
	.quad	.LC469
	.quad	.LC470
	.quad	.LC471
	.quad	.LC472
	.quad	.LC473
	.quad	.LC474
	.quad	.LC475
	.quad	.LC476
	.quad	.LC477
	.quad	.LC478
	.quad	.LC479
	.quad	.LC480
	.quad	.LC481
	.quad	.LC482
	.quad	.LC483
	.quad	.LC484
	.quad	.LC485
	.quad	.LC152
	.quad	.LC486
	.quad	.LC487
	.quad	.LC488
	.quad	.LC445
	.quad	.LC489
	.quad	.LC490
	.quad	.LC491
	.quad	.LC152
	.quad	.LC492
	.quad	.LC493
	.quad	.LC494
	.quad	.LC495
	.quad	.LC496
	.quad	.LC497
	.quad	.LC498
	.quad	.LC499
	.quad	.LC500
	.quad	.LC501
	.quad	.LC502
	.quad	.LC503
	.quad	.LC504
	.quad	.LC503
	.quad	.LC505
	.quad	.LC506
	.quad	.LC507
	.quad	.LC508
	.quad	.LC509
	.quad	.LC510
	.quad	.LC511
	.quad	.LC512
	.quad	.LC513
	.quad	.LC514
	.quad	.LC515
	.quad	.LC516
	.quad	.LC517
	.quad	.LC518
	.quad	.LC519
	.quad	.LC520
	.quad	.LC521
	.quad	.LC522
	.quad	.LC523
	.quad	.LC524
	.quad	.LC525
	.quad	.LC526
	.quad	.LC527
	.quad	.LC528
	.quad	.LC529
	.quad	.LC530
	.quad	.LC531
	.quad	.LC532
	.quad	.LC533
	.quad	.LC534
	.quad	.LC535
	.quad	.LC536
	.quad	.LC537
	.quad	.LC538
	.quad	.LC539
	.quad	.LC540
	.quad	.LC541
	.quad	.LC542
	.quad	.LC543
	.quad	.LC544
	.quad	.LC545
	.quad	.LC546
	.quad	.LC547
	.quad	.LC548
	.quad	.LC549
	.quad	.LC548
	.quad	.LC550
	.quad	.LC551
	.quad	.LC552
	.quad	.LC553
	.quad	.LC554
	.quad	.LC526
	.quad	.LC555
	.quad	.LC556
	.quad	.LC557
	.quad	.LC558
	.quad	.LC559
	.quad	.LC560
	.quad	.LC561
	.quad	.LC562
	.quad	.LC563
	.quad	.LC564
	.quad	.LC565
	.quad	.LC566
	.quad	.LC567
	.quad	.LC568
	.quad	.LC569
	.quad	.LC570
	.quad	.LC571
	.quad	.LC572
	.quad	.LC573
	.quad	.LC574
	.quad	.LC575
	.quad	.LC164
	.quad	.LC576
	.quad	.LC577
	.quad	.LC578
	.quad	.LC579
	.quad	.LC580
	.quad	.LC581
	.quad	.LC582
	.quad	.LC583
	.quad	.LC584
	.quad	.LC585
	.quad	.LC586
	.quad	.LC587
	.quad	.LC588
	.quad	.LC164
	.quad	.LC589
	.quad	.LC590
	.quad	.LC591
	.quad	.LC592
	.quad	.LC593
	.quad	.LC594
	.quad	.LC595
	.quad	.LC596
	.quad	.LC597
	.quad	.LC598
	.quad	.LC599
	.quad	.LC600
	.quad	.LC601
	.quad	.LC602
	.quad	.LC603
	.quad	.LC150
	.quad	.LC604
	.quad	.LC150
	.quad	.LC605
	.quad	.LC606
	.quad	.LC607
	.quad	.LC608
	.quad	.LC609
	.quad	.LC610
	.quad	.LC611
	.quad	.LC612
	.quad	.LC613
	.quad	.LC614
	.quad	.LC615
	.quad	.LC616
	.quad	.LC617
	.quad	.LC614
	.quad	.LC618
	.quad	.LC619
	.quad	.LC620
	.quad	.LC621
	.quad	.LC622
	.quad	.LC623
	.quad	.LC624
	.quad	.LC621
	.quad	.LC625
	.quad	.LC626
	.quad	.LC627
	.quad	.LC628
	.quad	.LC629
	.quad	.LC630
	.quad	.LC631
	.quad	.LC632
	.quad	.LC633
	.quad	.LC628
	.quad	.LC634
	.quad	.LC635
	.quad	.LC636
	.quad	.LC637
	.quad	.LC638
	.quad	.LC639
	.quad	.LC640
	.quad	.LC641
	.quad	.LC642
	.quad	.LC266
	.quad	.LC643
	.quad	.LC644
	.quad	.LC645
	.quad	.LC644
	.quad	.LC646
	.quad	.LC647
	.quad	.LC648
	.quad	.LC649
	.quad	.LC650
	.quad	.LC651
	.quad	.LC652
	.quad	.LC653
	.quad	.LC654
	.quad	.LC655
	.quad	.LC656
	.quad	.LC657
	.quad	.LC658
	.quad	.LC659
	.quad	.LC660
	.quad	.LC661
	.quad	.LC662
	.quad	.LC663
	.quad	.LC664
	.quad	.LC665
	.quad	.LC666
	.quad	.LC667
	.quad	.LC668
	.quad	.LC669
	.quad	.LC670
	.quad	.LC671
	.quad	.LC672
	.quad	.LC673
	.quad	.LC674
	.quad	.LC675
	.quad	.LC676
	.quad	.LC677
	.quad	.LC678
	.quad	.LC679
	.quad	.LC680
	.quad	.LC681
	.quad	.LC682
	.quad	.LC683
	.quad	.LC684
	.quad	.LC683
	.quad	.LC685
	.quad	.LC683
	.quad	.LC686
	.quad	.LC687
	.quad	.LC688
	.quad	.LC689
	.quad	.LC690
	.quad	.LC687
	.quad	.LC691
	.quad	.LC692
	.quad	.LC693
	.quad	.LC266
	.quad	.LC694
	.quad	.LC695
	.quad	.LC696
	.quad	.LC697
	.quad	.LC698
	.quad	.LC266
	.quad	.LC699
	.quad	.LC700
	.quad	.LC701
	.quad	.LC702
	.quad	.LC703
	.quad	.LC704
	.quad	.LC705
	.quad	.LC706
	.quad	.LC707
	.quad	.LC708
	.quad	.LC709
	.quad	.LC710
	.quad	.LC711
	.quad	.LC712
	.quad	.LC713
	.quad	.LC712
	.quad	.LC714
	.quad	.LC715
	.quad	.LC716
	.quad	.LC717
	.quad	.LC718
	.quad	.LC717
	.quad	.LC719
	.quad	.LC720
	.quad	.LC721
	.quad	.LC722
	.quad	.LC723
	.quad	.LC724
	.quad	.LC725
	.quad	.LC726
	.quad	.LC727
	.quad	.LC724
	.quad	.LC728
	.quad	.LC729
	.quad	.LC730
	.quad	.LC729
	.quad	.LC731
	.quad	.LC732
	.quad	.LC733
	.quad	.LC734
	.quad	.LC735
	.quad	.LC736
	.quad	.LC737
	.quad	.LC738
	.quad	.LC739
	.quad	.LC740
	.quad	.LC741
	.quad	.LC742
	.quad	.LC743
	.quad	.LC744
	.quad	.LC745
	.quad	.LC266
	.quad	.LC746
	.quad	.LC61
	.quad	.LC747
	.quad	.LC61
	.quad	.LC748
	.quad	.LC749
	.quad	.LC750
	.quad	.LC266
	.quad	.LC751
	.quad	.LC752
	.quad	.LC753
	.quad	.LC141
	.quad	.LC754
	.quad	.LC755
	.quad	.LC756
	.quad	.LC757
	.quad	.LC758
	.quad	.LC759
	.quad	.LC760
	.quad	.LC761
	.quad	.LC762
	.quad	.LC742
	.quad	.LC763
	.quad	.LC764
	.quad	.LC765
	.quad	.LC764
	.quad	.LC766
	.quad	.LC767
	.quad	.LC768
	.quad	.LC769
	.quad	.LC770
	.quad	.LC771
	.quad	.LC772
	.quad	.LC767
	.quad	.LC773
	.quad	.LC771
	.quad	.LC774
	.quad	.LC775
	.quad	.LC776
	.quad	.LC777
	.quad	.LC778
	.quad	.LC779
	.quad	.LC780
	.quad	.LC779
	.quad	.LC781
	.quad	.LC779
	.quad	.LC782
	.quad	.LC783
	.quad	.LC784
	.quad	.LC785
	.quad	.LC786
	.quad	.LC787
	.quad	.LC788
	.quad	.LC789
	.quad	.LC790
	.quad	.LC791
	.quad	.LC792
	.quad	.LC793
	.quad	.LC794
	.quad	.LC152
	.quad	.LC795
	.quad	.LC796
	.quad	.LC797
	.quad	.LC141
	.quad	.LC798
	.quad	.LC799
	.quad	.LC800
	.quad	.LC787
	.quad	.LC801
	.quad	.LC802
	.quad	.LC803
	.quad	.LC804
	.quad	.LC805
	.quad	.LC806
	.quad	.LC807
	.quad	.LC808
	.quad	.LC809
	.quad	.LC810
	.quad	.LC811
	.quad	.LC812
	.quad	.LC813
	.quad	.LC814
	.quad	.LC815
	.quad	.LC796
	.quad	.LC816
	.quad	.LC817
	.quad	.LC818
	.quad	.LC819
	.quad	.LC820
	.quad	.LC821
	.quad	.LC822
	.quad	.LC823
	.quad	.LC824
	.quad	.LC825
	.quad	.LC826
	.quad	.LC827
	.quad	.LC828
	.quad	.LC829
	.quad	.LC830
	.quad	.LC831
	.quad	.LC832
	.quad	.LC700
	.quad	.LC833
	.quad	.LC700
	.quad	.LC834
	.quad	.LC835
	.quad	.LC836
	.quad	.LC837
	.quad	.LC838
	.quad	.LC409
	.quad	.LC839
	.quad	.LC840
	.quad	.LC841
	.quad	.LC840
	.quad	.LC842
	.quad	.LC843
	.quad	.LC844
	.quad	.LC845
	.quad	.LC846
	.quad	.LC843
	.quad	.LC847
	.quad	.LC843
	.quad	.LC848
	.quad	.LC849
	.quad	.LC850
	.quad	.LC851
	.quad	.LC852
	.quad	.LC853
	.quad	.LC854
	.quad	.LC855
	.quad	.LC856
	.quad	.LC857
	.quad	.LC858
	.quad	.LC859
	.quad	.LC860
	.quad	.LC861
	.quad	.LC862
	.quad	.LC863
	.quad	.LC864
	.quad	.LC865
	.quad	.LC866
	.quad	.LC867
	.quad	.LC868
	.quad	.LC771
	.quad	.LC869
	.quad	.LC771
	.quad	.LC870
	.quad	.LC769
	.quad	.LC871
	.quad	.LC771
	.quad	.LC872
	.quad	.LC771
	.quad	.LC873
	.quad	.LC785
	.quad	.LC874
	.quad	.LC779
	.quad	.LC875
	.quad	.LC876
	.quad	.LC877
	.quad	.LC785
	.quad	.LC878
	.quad	.LC771
	.quad	.LC879
	.quad	.LC880
	.quad	.LC881
	.quad	.LC767
	.quad	.LC882
	.quad	.LC767
	.quad	.LC883
	.quad	.LC41
	.quad	.LC884
	.quad	.LC767
	.quad	.LC885
	.quad	.LC785
	.quad	.LC886
	.quad	.LC771
	.quad	.LC887
	.quad	.LC888
	.quad	.LC889
	.quad	.LC890
	.quad	.LC891
	.quad	.LC892
	.quad	.LC893
	.quad	.LC894
	.quad	.LC895
	.quad	.LC894
	.quad	.LC896
	.quad	.LC897
	.quad	.LC898
	.quad	.LC899
	.quad	.LC900
	.quad	.LC901
	.quad	.LC902
	.quad	.LC903
	.quad	.LC904
	.quad	.LC905
	.quad	.LC906
	.quad	.LC796
	.quad	.LC907
	.quad	.LC908
	.quad	.LC909
	.quad	.LC910
	.quad	.LC911
	.quad	.LC912
	.quad	.LC913
	.quad	.LC914
	.quad	.LC915
	.quad	.LC817
	.quad	.LC916
	.quad	.LC129
	.quad	.LC917
	.quad	.LC918
	.quad	.LC919
	.quad	.LC920
	.quad	.LC921
	.quad	.LC922
	.quad	.LC923
	.quad	.LC924
	.quad	.LC925
	.quad	.LC926
	.quad	.LC927
	.quad	.LC764
	.quad	.LC928
	.quad	.LC929
	.quad	.LC930
	.quad	.LC931
	.quad	.LC932
	.quad	.LC933
	.quad	.LC934
	.quad	.LC935
	.quad	.LC936
	.quad	.LC937
	.quad	.LC938
	.quad	.LC783
	.quad	.LC939
	.quad	.LC940
	.quad	.LC941
	.quad	.LC942
	.quad	.LC943
	.quad	.LC787
	.quad	.LC944
	.quad	.LC945
	.quad	.LC946
	.quad	.LC947
	.quad	.LC948
	.quad	.LC949
	.quad	.LC950
	.quad	.LC951
	.quad	.LC952
	.quad	.LC953
	.quad	.LC954
	.quad	.LC955
	.quad	.LC956
	.quad	.LC957
	.quad	.LC958
	.quad	.LC959
	.quad	.LC960
	.quad	.LC961
	.quad	.LC962
	.quad	.LC963
	.quad	.LC964
	.quad	.LC965
	.quad	.LC966
	.quad	.LC967
	.quad	.LC968
	.quad	.LC969
	.quad	.LC970
	.quad	.LC971
	.quad	.LC972
	.quad	.LC955
	.quad	.LC973
	.quad	.LC974
	.quad	.LC975
	.quad	.LC976
	.quad	.LC977
	.quad	.LC978
	.quad	.LC979
	.quad	.LC980
	.quad	.LC981
	.quad	.LC982
	.quad	.LC983
	.quad	.LC984
	.quad	.LC985
	.quad	.LC986
	.quad	.LC987
	.quad	.LC988
	.quad	.LC989
	.quad	.LC990
	.quad	.LC991
	.quad	.LC992
	.quad	.LC993
	.quad	.LC994
	.quad	.LC995
	.quad	.LC996
	.quad	.LC997
	.quad	.LC998
	.quad	.LC999
	.quad	.LC1000
	.quad	.LC1001
	.quad	.LC1002
	.quad	.LC1003
	.quad	.LC1004
	.quad	.LC1005
	.quad	.LC1006
	.quad	.LC1007
	.quad	.LC1008
	.quad	.LC1009
	.quad	.LC1008
	.quad	.LC1010
	.quad	.LC1011
	.quad	.LC1012
	.quad	.LC1013
	.quad	.LC1014
	.quad	.LC1015
	.quad	.LC1016
	.quad	.LC1017
	.quad	.LC1018
	.quad	.LC1017
	.quad	.LC1019
	.quad	.LC1017
	.quad	.LC1020
	.quad	.LC1017
	.quad	.LC1021
	.quad	.LC1022
	.quad	.LC1023
	.quad	.LC1024
	.quad	.LC1025
	.quad	.LC1026
	.quad	.LC1027
	.quad	.LC1028
	.quad	.LC1029
	.quad	.LC1030
	.quad	.LC1031
	.quad	.LC1032
	.quad	.LC1033
	.quad	.LC1034
	.quad	.LC1035
	.quad	.LC1036
	.quad	.LC1037
	.quad	.LC1038
	.quad	.LC1039
	.quad	.LC1040
	.quad	.LC1041
	.quad	.LC1042
	.quad	.LC1043
	.quad	.LC1044
	.quad	.LC1045
	.quad	.LC1046
	.quad	.LC1047
	.quad	.LC1048
	.quad	.LC1049
	.quad	.LC1050
	.quad	.LC1051
	.quad	.LC1052
	.quad	.LC1053
	.quad	.LC1054
	.quad	.LC1055
	.quad	.LC1056
	.quad	.LC1057
	.quad	.LC1058
	.quad	.LC1059
	.quad	.LC1060
	.quad	.LC1061
	.quad	.LC1062
	.quad	.LC1063
	.quad	.LC1062
	.quad	.LC1064
	.quad	.LC1065
	.quad	.LC1066
	.quad	.LC1067
	.quad	.LC1068
	.quad	.LC1069
	.quad	.LC1070
	.quad	.LC1054
	.quad	.LC1071
	.quad	.LC1072
	.quad	.LC1073
	.quad	.LC1074
	.quad	.LC1075
	.quad	.LC1076
	.quad	.LC1077
	.quad	.LC180
	.quad	.LC1078
	.quad	.LC1079
	.quad	.LC1080
	.quad	.LC1081
	.quad	.LC1082
	.quad	.LC1083
	.quad	.LC1084
	.quad	.LC1085
	.quad	.LC1086
	.quad	.LC1087
	.quad	.LC1088
	.quad	.LC1089
	.quad	.LC1090
	.quad	.LC1026
	.quad	.LC1091
	.quad	.LC1092
	.quad	.LC1093
	.quad	.LC59
	.quad	.LC1094
	.quad	.LC59
	.quad	.LC1095
	.quad	.LC59
	.quad	.LC1096
	.quad	.LC1097
	.quad	.LC1098
	.quad	.LC1058
	.quad	.LC1099
	.quad	.LC1100
	.quad	.LC1101
	.quad	.LC1102
	.quad	.LC1103
	.quad	.LC1104
	.quad	.LC1105
	.quad	.LC1085
	.quad	.LC1106
	.quad	.LC1085
	.quad	.LC1107
	.quad	.LC141
	.quad	.LC1108
	.quad	.LC1109
	.quad	.LC1110
	.quad	.LC1111
	.quad	.LC1112
	.quad	.LC1113
	.quad	.LC1114
	.quad	.LC1115
	.quad	.LC1116
	.quad	.LC1117
	.quad	.LC1118
	.quad	.LC1119
	.quad	.LC1120
	.quad	.LC1121
	.quad	.LC1122
	.quad	.LC1123
	.quad	.LC1124
	.quad	.LC1125
	.quad	.LC1126
	.quad	.LC789
	.quad	.LC1127
	.quad	.LC1128
	.quad	.LC1129
	.quad	.LC1130
	.quad	.LC1131
	.quad	.LC1132
	.quad	.LC1133
	.quad	.LC1134
	.quad	.LC1135
	.quad	.LC1136
	.quad	.LC1137
	.quad	.LC1138
	.quad	.LC1139
	.quad	.LC1140
	.quad	.LC1141
	.quad	.LC1130
	.quad	.LC1142
	.quad	.LC1143
	.quad	.LC1144
	.quad	.LC1145
	.quad	.LC1146
	.quad	.LC1130
	.quad	.LC1147
	.quad	.LC1148
	.quad	.LC1149
	.quad	.LC1150
	.quad	.LC1151
	.quad	.LC1026
	.quad	.LC1152
	.quad	.LC861
	.quad	.LC1153
	.quad	.LC1154
	.quad	.LC1155
	.quad	.LC1156
	.quad	.LC1157
	.quad	.LC65
	.quad	.LC1158
	.quad	.LC1159
	.quad	.LC1160
	.quad	.LC1161
	.quad	.LC1162
	.quad	.LC1163
	.quad	.LC1164
	.quad	.LC1165
	.quad	.LC1166
	.quad	.LC1167
	.quad	.LC1168
	.quad	.LC1169
	.quad	.LC1170
	.quad	.LC1171
	.quad	.LC1172
	.quad	.LC1173
	.quad	.LC1174
	.quad	.LC1175
	.quad	.LC1176
	.quad	.LC1177
	.quad	.LC1178
	.quad	.LC1179
	.quad	.LC1180
	.quad	.LC1181
	.quad	.LC1182
	.quad	.LC1183
	.quad	.LC1184
	.quad	.LC1185
	.quad	.LC1186
	.quad	.LC865
	.quad	.LC1187
	.quad	.LC1188
	.quad	.LC1189
	.quad	.LC1188
	.quad	.LC1190
	.quad	.LC1191
	.quad	.LC1192
	.quad	.LC1191
	.quad	.LC1193
	.quad	.LC1191
	.quad	.LC1194
	.quad	.LC1191
	.quad	.LC1195
	.quad	.LC1191
	.quad	.LC1196
	.quad	.LC1191
	.quad	.LC1197
	.quad	.LC1198
	.quad	.LC1199
	.quad	.LC1198
	.quad	.LC1200
	.quad	.LC1201
	.quad	.LC1202
	.quad	.LC1203
	.quad	.LC1204
	.quad	.LC1205
	.quad	.LC1206
	.quad	.LC1207
	.quad	.LC1208
	.quad	.LC1209
	.quad	.LC1210
	.quad	.LC1211
	.quad	.LC1212
	.quad	.LC1213
	.quad	.LC1214
	.quad	.LC1215
	.quad	.LC1216
	.quad	.LC1217
	.quad	.LC1218
	.quad	.LC1219
	.quad	.LC1220
	.quad	.LC1221
	.quad	.LC1222
	.quad	.LC1223
	.quad	.LC1224
	.quad	.LC1225
	.quad	.LC1226
	.quad	.LC1227
	.quad	.LC1228
	.quad	.LC1229
	.quad	.LC1230
	.quad	.LC700
	.quad	.LC1231
	.quad	.LC1232
	.quad	.LC1233
	.quad	.LC1234
	.quad	.LC1235
	.quad	.LC1236
	.quad	.LC1237
	.quad	.LC1238
	.quad	.LC1239
	.quad	.LC1240
	.quad	.LC1241
	.quad	.LC796
	.quad	.LC1242
	.quad	.LC1243
	.quad	.LC1244
	.quad	.LC1245
	.quad	.LC1246
	.quad	.LC1247
	.quad	.LC1248
	.quad	.LC1249
	.quad	.LC1250
	.quad	.LC1251
	.quad	.LC1252
	.quad	.LC1253
	.quad	.LC1254
	.quad	.LC1255
	.quad	.LC1256
	.quad	.LC1257
	.quad	.LC1258
	.quad	.LC1259
	.quad	.LC1260
	.quad	.LC97
	.quad	.LC1261
	.quad	.LC1262
	.quad	.LC1263
	.quad	.LC1264
	.quad	.LC1265
	.quad	.LC1266
	.quad	.LC1267
	.quad	.LC1268
	.quad	.LC1269
	.quad	.LC1270
	.quad	.LC1271
	.quad	.LC1272
	.quad	.LC1273
	.quad	.LC1274
	.quad	.LC1275
	.quad	.LC1276
	.quad	.LC1277
	.quad	.LC1278
	.quad	.LC1279
	.quad	.LC1280
	.quad	.LC1281
	.quad	.LC1282
	.quad	.LC1283
	.quad	.LC1284
	.quad	.LC1285
	.quad	.LC1286
	.quad	.LC1287
	.quad	.LC1286
	.quad	.LC1288
	.quad	.LC1289
	.quad	.LC1290
	.quad	.LC1291
	.quad	.LC1292
	.quad	.LC1293
	.quad	.LC1294
	.quad	.LC306
	.quad	.LC1295
	.quad	.LC1296
	.quad	.LC1297
	.quad	.LC1298
	.quad	.LC1299
	.quad	.LC1300
	.quad	.LC1301
	.quad	.LC1302
	.quad	.LC1303
	.quad	.LC1304
	.quad	.LC1305
	.quad	.LC1306
	.quad	.LC1307
	.quad	.LC1308
	.quad	.LC1309
	.quad	.LC1310
	.quad	.LC1311
	.quad	.LC1312
	.quad	.LC1313
	.quad	.LC1314
	.quad	.LC1315
	.quad	.LC1316
	.quad	.LC1317
	.quad	.LC1318
	.quad	.LC1319
	.quad	.LC1318
	.quad	.LC1320
	.quad	.LC1321
	.quad	.LC1322
	.quad	.LC1323
	.quad	.LC1324
	.quad	.LC1325
	.quad	.LC1326
	.quad	.LC1327
	.quad	.LC1328
	.quad	.LC93
	.quad	.LC1329
	.quad	.LC1330
	.quad	.LC1331
	.quad	.LC817
	.quad	.LC1332
	.quad	.LC1333
	.quad	.LC1334
	.quad	.LC1333
	.quad	.LC1335
	.quad	.LC1336
	.quad	.LC1337
	.quad	.LC1338
	.quad	.LC1339
	.quad	.LC1340
	.quad	.LC1341
	.quad	.LC1340
	.quad	.LC1342
	.quad	.LC1340
	.quad	.LC1343
	.quad	.LC1340
	.quad	.LC1344
	.quad	.LC1345
	.quad	.LC1346
	.quad	.LC1347
	.quad	.LC1348
	.quad	.LC1349
	.quad	.LC1350
	.quad	.LC1351
	.quad	.LC1352
	.quad	.LC1353
	.quad	.LC1354
	.quad	.LC1355
	.quad	.LC1356
	.quad	.LC1355
	.quad	.LC1357
	.quad	.LC1358
	.quad	.LC1359
	.quad	.LC1360
	.quad	.LC1361
	.quad	.LC111
	.quad	.LC1362
	.quad	.LC1363
	.quad	.LC1364
	.quad	.LC141
	.quad	.LC1365
	.quad	.LC1060
	.quad	.LC1366
	.quad	.LC1367
	.quad	.LC1368
	.quad	.LC1369
	.quad	.LC1370
	.quad	.LC1371
	.quad	.LC1372
	.quad	.LC1373
	.quad	.LC1374
	.quad	.LC1375
	.quad	.LC1376
	.quad	.LC1008
	.quad	.LC1377
	.quad	.LC1378
	.quad	.LC1379
	.quad	.LC1380
	.quad	.LC1381
	.quad	.LC1382
	.quad	.LC1383
	.quad	.LC1384
	.quad	.LC1385
	.quad	.LC1386
	.quad	.LC1387
	.quad	.LC1388
	.quad	.LC1389
	.quad	.LC1390
	.quad	.LC1391
	.quad	.LC1392
	.quad	.LC1393
	.quad	.LC1394
	.quad	.LC1395
	.quad	.LC1396
	.quad	.LC1397
	.quad	.LC1398
	.quad	.LC1399
	.quad	.LC1400
	.quad	.LC1401
	.quad	.LC1402
	.quad	.LC1403
	.quad	.LC1404
	.quad	.LC1405
	.quad	.LC1406
	.quad	.LC1407
	.quad	.LC1408
	.quad	.LC1409
	.quad	.LC1410
	.quad	.LC1411
	.quad	.LC1412
	.quad	.LC1413
	.quad	.LC1414
	.quad	.LC1415
	.quad	.LC1416
	.quad	.LC1417
	.quad	.LC1416
	.quad	.LC1418
	.quad	.LC1419
	.quad	.LC1420
	.quad	.LC1421
	.quad	.LC1422
	.quad	.LC1423
	.quad	.LC1424
	.quad	.LC1425
	.quad	.LC1426
	.quad	.LC1427
	.quad	.LC1428
	.quad	.LC1427
	.quad	.LC1429
	.quad	.LC193
	.quad	.LC1430
	.quad	.LC1431
	.quad	.LC1432
	.quad	.LC1433
	.quad	.LC1434
	.quad	.LC1435
	.quad	.LC1436
	.quad	.LC1437
	.quad	.LC1438
	.quad	.LC1439
	.quad	.LC1440
	.quad	.LC1441
	.quad	.LC1442
	.quad	.LC1443
	.quad	.LC1444
	.quad	.LC1445
	.quad	.LC1446
	.quad	.LC796
	.quad	.LC1447
	.quad	.LC1448
	.quad	.LC1449
	.quad	.LC1450
	.quad	.LC1451
	.quad	.LC1452
	.quad	.LC1453
	.quad	.LC1454
	.quad	.LC1455
	.quad	.LC1456
	.quad	.LC1457
	.quad	.LC1458
	.quad	.LC1459
	.quad	.LC1460
	.quad	.LC1461
	.quad	.LC1462
	.quad	.LC1463
	.quad	.LC1462
	.quad	.LC1464
	.quad	.LC1465
	.quad	.LC1466
	.quad	.LC1467
	.quad	.LC1468
	.quad	.LC1467
	.quad	.LC1469
	.quad	.LC266
	.quad	.LC1470
	.quad	.LC1471
	.quad	.LC1472
	.quad	.LC1473
	.quad	.LC1474
	.quad	.LC1475
	.quad	.LC1476
	.quad	.LC1477
	.quad	.LC1478
	.quad	.LC1479
	.quad	.LC1480
	.quad	.LC1479
	.quad	.LC1481
	.quad	.LC1482
	.quad	.LC1483
	.quad	.LC1484
	.quad	.LC1485
	.quad	.LC1486
	.quad	.LC1487
	.quad	.LC1488
	.quad	.LC1489
	.quad	.LC796
	.quad	.LC1490
	.quad	.LC1491
	.quad	.LC1492
	.quad	.LC1493
	.quad	.LC1494
	.quad	.LC1495
	.quad	.LC1496
	.quad	.LC1497
	.quad	.LC1498
	.quad	.LC1499
	.quad	.LC1500
	.quad	.LC1501
	.quad	.LC1502
	.quad	.LC1503
	.quad	.LC1504
	.quad	.LC1505
	.quad	.LC1506
	.quad	.LC1505
	.quad	.LC1507
	.quad	.LC1508
	.quad	.LC1509
	.quad	.LC1510
	.quad	.LC1511
	.quad	.LC266
	.quad	.LC1512
	.quad	.LC33
	.quad	.LC1513
	.quad	.LC319
	.quad	.LC1514
	.quad	.LC1515
	.quad	.LC1516
	.quad	.LC1515
	.quad	.LC1517
	.quad	.LC111
	.quad	.LC1518
	.quad	.LC1519
	.quad	.LC1520
	.quad	.LC1521
	.quad	.LC1522
	.quad	.LC1523
	.quad	.LC1524
	.quad	.LC1525
	.quad	.LC1526
	.quad	.LC1527
	.quad	.LC1528
	.quad	.LC1527
	.quad	.LC1529
	.quad	.LC1527
	.quad	.LC1530
	.quad	.LC1531
	.quad	.LC1532
	.quad	.LC1533
	.quad	.LC1534
	.quad	.LC1535
	.quad	.LC1536
	.quad	.LC1537
	.quad	.LC1538
	.quad	.LC1539
	.quad	.LC1540
	.quad	.LC1539
	.quad	.LC1541
	.quad	.LC1542
	.quad	.LC1543
	.quad	.LC1544
	.quad	.LC1545
	.quad	.LC1542
	.quad	.LC1546
	.quad	.LC1547
	.quad	.LC1548
	.quad	.LC1549
	.quad	.LC1550
	.quad	.LC1551
	.quad	.LC1552
	.quad	.LC1553
	.quad	.LC1554
	.quad	.LC1555
	.quad	.LC1556
	.quad	.LC1557
	.quad	.LC1558
	.quad	.LC1537
	.quad	.LC1559
	.quad	.LC1539
	.quad	.LC1560
	.quad	.LC1539
	.quad	.LC1561
	.quad	.LC1542
	.quad	.LC1562
	.quad	.LC1544
	.quad	.LC1563
	.quad	.LC1542
	.quad	.LC1564
	.quad	.LC1547
	.quad	.LC1565
	.quad	.LC1549
	.quad	.LC1566
	.quad	.LC1551
	.quad	.LC1567
	.quad	.LC1553
	.quad	.LC1568
	.quad	.LC1555
	.quad	.LC1569
	.quad	.LC1557
	.quad	.LC1570
	.quad	.LC1571
	.quad	.LC1572
	.quad	.LC1573
	.quad	.LC1574
	.quad	.LC1571
	.quad	.LC1575
	.quad	.LC1573
	.quad	.LC1576
	.quad	.LC1577
	.quad	.LC1578
	.quad	.LC1579
	.quad	.LC1580
	.quad	.LC1581
	.quad	.LC1582
	.quad	.LC1583
	.quad	.LC1584
	.quad	.LC1585
	.quad	.LC1586
	.quad	.LC1587
	.quad	.LC1588
	.quad	.LC1589
	.quad	.LC1590
	.quad	.LC1591
	.quad	.LC1592
	.quad	.LC1593
	.quad	.LC1594
	.quad	.LC1291
	.quad	.LC1595
	.quad	.LC33
	.quad	.LC1596
	.quad	.LC1597
	.quad	.LC1598
	.quad	.LC1599
	.quad	.LC1600
	.quad	.LC1601
	.quad	.LC1602
	.quad	.LC1599
	.quad	.LC1603
	.quad	.LC1599
	.quad	.LC1604
	.quad	.LC1599
	.quad	.LC1605
	.quad	.LC1606
	.quad	.LC1607
	.quad	.LC1608
	.quad	.LC1609
	.quad	.LC193
	.quad	.LC1610
	.quad	.LC1611
	.quad	.LC1612
	.quad	.LC1613
	.quad	.LC1614
	.quad	.LC1615
	.quad	.LC1616
	.quad	.LC1617
	.quad	.LC1618
	.quad	.LC1619
	.quad	.LC1620
	.quad	.LC1621
	.quad	.LC1622
	.quad	.LC1623
	.quad	.LC1624
	.quad	.LC1623
	.quad	.LC1625
	.quad	.LC1626
	.quad	.LC1627
	.quad	.LC1628
	.quad	.LC1629
	.quad	.LC1630
	.quad	.LC1631
	.quad	.LC1632
	.quad	.LC1633
	.quad	.LC1634
	.quad	.LC1635
	.quad	.LC1636
	.quad	.LC1637
	.quad	.LC1623
	.quad	.LC1638
	.quad	.LC1639
	.quad	.LC1640
	.quad	.LC1641
	.quad	.LC1642
	.quad	.LC1643
	.quad	.LC1644
	.quad	.LC407
	.quad	.LC1645
	.quad	.LC1646
	.quad	.LC1647
	.quad	.LC1648
	.quad	.LC1649
	.quad	.LC1650
	.quad	.LC1651
	.quad	.LC1652
	.quad	.LC1653
	.quad	.LC1654
	.quad	.LC1655
	.quad	.LC1656
	.quad	.LC1657
	.quad	.LC407
	.quad	.LC1658
	.quad	.LC1659
	.quad	.LC1660
	.quad	.LC1661
	.quad	.LC1662
	.quad	.LC1663
	.quad	.LC1664
	.quad	.LC1665
	.quad	.LC1666
	.quad	.LC1623
	.quad	.LC1667
	.quad	.LC1668
	.quad	.LC1669
	.quad	.LC1670
	.quad	.LC1671
	.quad	.LC1597
	.quad	.LC1672
	.quad	.LC1673
	.quad	.LC1674
	.quad	.LC1675
	.quad	.LC1676
	.quad	.LC1677
	.quad	.LC1678
	.quad	.LC1679
	.quad	.LC1680
	.quad	.LC33
	.quad	.LC1681
	.quad	.LC1682
	.quad	.LC1683
	.quad	.LC1684
	.quad	.LC1685
	.quad	.LC1684
	.quad	.LC1686
	.quad	.LC1687
	.quad	.LC1688
	.quad	.LC1687
	.quad	.LC1689
	.quad	.LC1682
	.quad	.LC1690
	.quad	.LC1691
	.quad	.LC1692
	.quad	.LC1693
	.quad	.LC1694
	.quad	.LC1695
	.quad	.LC1696
	.quad	.LC1697
	.quad	.LC1698
	.quad	.LC1699
	.quad	.LC1700
	.quad	.LC1701
	.quad	.LC1702
	.quad	.LC1703
	.quad	.LC1704
	.quad	.LC1705
	.quad	.LC1706
	.quad	.LC1707
	.quad	.LC1708
	.quad	.LC1709
	.quad	.LC1710
	.quad	.LC1711
	.quad	.LC1712
	.quad	.LC1713
	.quad	.LC1714
	.quad	.LC1715
	.quad	.LC1716
	.quad	.LC1717
	.quad	.LC1718
	.quad	.LC1719
	.quad	.LC1720
	.quad	.LC1721
	.quad	.LC1722
	.quad	.LC1721
	.quad	.LC1723
	.quad	.LC935
	.quad	.LC1724
	.quad	.LC1725
	.quad	.LC1726
	.quad	.LC1727
	.quad	.LC1728
	.quad	.LC1729
	.quad	.LC1730
	.quad	.LC1727
	.quad	.LC1731
	.quad	.LC1732
	.quad	.LC1733
	.quad	.LC1727
	.quad	.LC1734
	.quad	.LC1727
	.quad	.LC1735
	.quad	.LC1736
	.quad	.LC1737
	.quad	.LC1738
	.quad	.LC1739
	.quad	.LC1740
	.quad	.LC1741
	.quad	.LC1727
	.quad	.LC1742
	.quad	.LC1743
	.quad	.LC1744
	.quad	.LC1745
	.quad	.LC1746
	.quad	.LC1727
	.quad	.LC1747
	.quad	.LC1748
	.quad	.LC1749
	.quad	.LC1750
	.quad	.LC1751
	.quad	.LC1752
	.quad	.LC1753
	.quad	.LC1754
	.quad	.LC1755
	.quad	.LC1756
	.quad	.LC1757
	.quad	.LC1758
	.quad	.LC1759
	.quad	.LC1760
	.quad	.LC1761
	.quad	.LC1762
	.quad	.LC1763
	.quad	.LC1764
	.quad	.LC1765
	.quad	.LC1766
	.quad	.LC1767
	.quad	.LC1766
	.quad	.LC1768
	.quad	.LC1750
	.quad	.LC1769
	.quad	.LC1770
	.quad	.LC1771
	.quad	.LC1772
	.quad	.LC1773
	.quad	.LC1774
	.quad	.LC1775
	.quad	.LC1776
	.quad	.LC1777
	.quad	.LC935
	.quad	.LC1778
	.quad	.LC935
	.quad	.LC1779
	.quad	.LC1780
	.quad	.LC1781
	.quad	.LC1782
	.quad	.LC1783
	.quad	.LC1784
	.quad	.LC1785
	.quad	.LC1786
	.quad	.LC1787
	.quad	.LC1788
	.quad	.LC1789
	.quad	.LC1790
	.quad	.LC1791
	.quad	.LC1792
	.quad	.LC1793
	.quad	.LC1792
	.quad	.LC1794
	.quad	.LC1792
	.quad	.LC1795
	.quad	.LC1792
	.quad	.LC1796
	.quad	.LC1792
	.quad	.LC1797
	.quad	.LC1792
	.quad	.LC1798
	.quad	.LC1792
	.quad	.LC1799
	.quad	.LC1792
	.quad	.LC1800
	.quad	.LC1801
	.quad	.LC1802
	.quad	.LC1803
	.quad	.LC1804
	.quad	.LC1805
	.quad	.LC1806
	.quad	.LC1805
	.quad	.LC1807
	.quad	.LC1808
	.section	.rodata
.LC1809:
	.string	"mesty.h"
.LC1810:
	.string	"strifext != NULL"
.LC1811:
	.string	"."
	.text
	.globl	mestyof
	.type	mestyof, @function
mestyof:
.LFB27:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L84
	leaq	__PRETTY_FUNCTION__.2839(%rip), %rcx
	movl	$1035, %edx
	leaq	.LC1809(%rip), %rsi
	leaq	.LC1810(%rip), %rdi
	call	__assert_fail@PLT
.L84:
	movq	-24(%rbp), %rax
	movq	%rax, -8(%rbp)
	movq	-8(%rbp), %rax
	movl	$46, %esi
	movq	%rax, %rdi
	call	strrchr@PLT
	movq	%rax, -8(%rbp)
	movq	-8(%rbp), %rax
	leaq	.LC1811(%rip), %rsi
	movq	%rax, %rdi
	call	strtok@PLT
	movq	%rax, -8(%rbp)
	movq	$0, -16(%rbp)
	jmp	.L85
.L88:
	movq	-16(%rbp), %rax
	salq	$4, %rax
	movq	%rax, %rdx
	leaq	MIME_MAPPING(%rip), %rax
	movq	(%rdx,%rax), %rax
	movq	-8(%rbp), %rdx
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	strcmp@PLT
	testl	%eax, %eax
	jne	.L86
	movq	-16(%rbp), %rax
	salq	$4, %rax
	movq	%rax, %rdx
	leaq	8+MIME_MAPPING(%rip), %rax
	movq	(%rdx,%rax), %rax
	jmp	.L87
.L86:
	addq	$1, -16(%rbp)
.L85:
	cmpq	$1009, -16(%rbp)
	jbe	.L88
	movl	$0, %eax
.L87:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE27:
	.size	mestyof, .-mestyof
	.section	.rodata
.LC1812:
	.string	"mesty != NULL"
	.text
	.globl	fextof
	.type	fextof, @function
fextof:
.LFB28:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movq	%rdi, -24(%rbp)
	cmpq	$0, -24(%rbp)
	jne	.L90
	leaq	__PRETTY_FUNCTION__.2848(%rip), %rcx
	movl	$1051, %edx
	leaq	.LC1809(%rip), %rsi
	leaq	.LC1812(%rip), %rdi
	call	__assert_fail@PLT
.L90:
	movq	$0, -8(%rbp)
	jmp	.L91
.L94:
	movq	-8(%rbp), %rax
	salq	$4, %rax
	movq	%rax, %rdx
	leaq	8+MIME_MAPPING(%rip), %rax
	movq	(%rdx,%rax), %rax
	movq	-24(%rbp), %rdx
	movq	%rdx, %rsi
	movq	%rax, %rdi
	call	strcmp@PLT
	testl	%eax, %eax
	jne	.L92
	movq	-8(%rbp), %rax
	salq	$4, %rax
	movq	%rax, %rdx
	leaq	MIME_MAPPING(%rip), %rax
	movq	(%rdx,%rax), %rax
	jmp	.L93
.L92:
	addq	$1, -8(%rbp)
.L91:
	cmpq	$1009, -8(%rbp)
	jbe	.L94
	movl	$0, %eax
.L93:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE28:
	.size	fextof, .-fextof
	.globl	chexint
	.type	chexint, @function
chexint:
.LFB29:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movl	%edi, %eax
	movb	%al, -4(%rbp)
	cmpb	$47, -4(%rbp)
	jle	.L96
	cmpb	$57, -4(%rbp)
	jg	.L96
	movsbl	-4(%rbp), %eax
	subl	$48, %eax
	jmp	.L97
.L96:
	cmpb	$64, -4(%rbp)
	jle	.L98
	cmpb	$70, -4(%rbp)
	jg	.L98
	movsbl	-4(%rbp), %eax
	subl	$55, %eax
	jmp	.L97
.L98:
	cmpb	$96, -4(%rbp)
	jle	.L99
	cmpb	$102, -4(%rbp)
	jg	.L99
	movsbl	-4(%rbp), %eax
	subl	$87, %eax
	jmp	.L97
.L99:
	movl	$-1, %eax
.L97:
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE29:
	.size	chexint, .-chexint
	.globl	strhexint
	.type	strhexint, @function
strhexint:
.LFB30:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	pushq	%rbx
	subq	$8, %rsp
	.cfi_offset 3, -24
	movq	%rdi, -16(%rbp)
	movq	-16(%rbp), %rax
	movzbl	(%rax), %eax
	movsbl	%al, %eax
	movl	%eax, %edi
	call	chexint
	sall	$4, %eax
	movl	%eax, %ebx
	movq	-16(%rbp), %rax
	addq	$1, %rax
	movzbl	(%rax), %eax
	movsbl	%al, %eax
	movl	%eax, %edi
	call	chexint
	addl	%ebx, %eax
	addq	$8, %rsp
	popq	%rbx
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE30:
	.size	strhexint, .-strhexint
	.section	.rodata
.LC1813:
	.string	"%X"
	.text
	.globl	strhex
	.type	strhex, @function
strhex:
.LFB31:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$80, %rsp
	movq	%rdi, -72(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -8(%rbp)
	xorl	%eax, %eax
	movq	-72(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	movq	%rax, -40(%rbp)
	movq	-40(%rbp), %rax
	addq	%rax, %rax
	movq	%rax, -32(%rbp)
	movq	-32(%rbp), %rax
	movq	%rax, %rdi
	call	mlcstr
	movq	%rax, -24(%rbp)
	movq	$0, -48(%rbp)
	jmp	.L103
.L105:
	movw	$0, -10(%rbp)
	movq	-72(%rbp), %rdx
	movq	-48(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	movsbl	%al, %eax
	movzbl	%al, %edx
	leaq	-10(%rbp), %rax
	leaq	.LC1813(%rip), %rsi
	movq	%rax, %rdi
	movl	$0, %eax
	call	sprintf@PLT
	movzbl	-9(%rbp), %eax
	testb	%al, %al
	jne	.L104
	movzbl	-10(%rbp), %eax
	movb	%al, -49(%rbp)
	movb	$48, -10(%rbp)
	movzbl	-49(%rbp), %eax
	movb	%al, -9(%rbp)
.L104:
	movq	-48(%rbp), %rax
	leaq	(%rax,%rax), %rdx
	movq	-24(%rbp), %rax
	addq	%rax, %rdx
	movzbl	-10(%rbp), %eax
	movb	%al, (%rdx)
	movq	-48(%rbp), %rax
	addq	%rax, %rax
	leaq	1(%rax), %rdx
	movq	-24(%rbp), %rax
	addq	%rax, %rdx
	movzbl	-9(%rbp), %eax
	movb	%al, (%rdx)
	addq	$1, -48(%rbp)
.L103:
	movq	-48(%rbp), %rax
	cmpq	-40(%rbp), %rax
	jb	.L105
	movq	-24(%rbp), %rax
	movq	-8(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L107
	call	__stack_chk_fail@PLT
.L107:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE31:
	.size	strhex, .-strhex
	.globl	prshex
	.type	prshex, @function
prshex:
.LFB32:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$64, %rsp
	movq	%rdi, -56(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -8(%rbp)
	xorl	%eax, %eax
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	movq	%rax, -32(%rbp)
	movq	-32(%rbp), %rax
	shrq	%rax
	movq	%rax, %rdi
	call	mlcstr
	movq	%rax, -24(%rbp)
	movq	$0, -40(%rbp)
	jmp	.L109
.L110:
	movq	-56(%rbp), %rdx
	movq	-40(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	movb	%al, -10(%rbp)
	movq	-40(%rbp), %rax
	leaq	1(%rax), %rdx
	movq	-56(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	movb	%al, -9(%rbp)
	leaq	-10(%rbp), %rax
	movq	%rax, %rdi
	call	strhexint
	movl	%eax, %ecx
	movq	-40(%rbp), %rax
	shrq	%rax
	movq	%rax, %rdx
	movq	-24(%rbp), %rax
	addq	%rdx, %rax
	movl	%ecx, %edx
	movb	%dl, (%rax)
	addq	$2, -40(%rbp)
.L109:
	movq	-40(%rbp), %rax
	cmpq	-32(%rbp), %rax
	jb	.L110
	movq	-24(%rbp), %rax
	movq	-8(%rbp), %rsi
	xorq	%fs:40, %rsi
	je	.L112
	call	__stack_chk_fail@PLT
.L112:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE32:
	.size	prshex, .-prshex
	.globl	prscolhex
	.type	prscolhex, @function
prscolhex:
.LFB33:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$64, %rsp
	movq	%rdi, -56(%rbp)
	movq	%fs:40, %rax
	movq	%rax, -8(%rbp)
	xorl	%eax, %eax
	movl	$1, -40(%rbp)
	movl	$12, %edi
	call	malloc@PLT
	movq	%rax, -24(%rbp)
	movq	-56(%rbp), %rax
	movzbl	(%rax), %eax
	cmpb	$35, %al
	sete	%al
	movzbl	%al, %eax
	movq	%rax, -32(%rbp)
	jmp	.L114
.L120:
	movq	-56(%rbp), %rdx
	movq	-32(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	movb	%al, -10(%rbp)
	movq	-32(%rbp), %rax
	leaq	1(%rax), %rdx
	movq	-56(%rbp), %rax
	addq	%rdx, %rax
	movzbl	(%rax), %eax
	movb	%al, -9(%rbp)
	leaq	-10(%rbp), %rax
	movq	%rax, %rdi
	call	strhexint
	movl	%eax, -36(%rbp)
	cmpl	$3, -40(%rbp)
	jg	.L123
	cmpl	$1, -40(%rbp)
	jne	.L116
	movq	-24(%rbp), %rax
	movl	-36(%rbp), %edx
	movl	%edx, (%rax)
	jmp	.L117
.L116:
	cmpl	$2, -40(%rbp)
	jne	.L118
	movq	-24(%rbp), %rax
	movl	-36(%rbp), %edx
	movl	%edx, 4(%rax)
	jmp	.L117
.L118:
	cmpl	$3, -40(%rbp)
	jne	.L117
	movq	-24(%rbp), %rax
	movl	-36(%rbp), %edx
	movl	%edx, 8(%rax)
.L117:
	addl	$1, -40(%rbp)
	addq	$2, -32(%rbp)
.L114:
	movq	-56(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	cmpq	%rax, -32(%rbp)
	jb	.L120
	jmp	.L119
.L123:
	nop
.L119:
	movq	-24(%rbp), %rax
	movq	-8(%rbp), %rcx
	xorq	%fs:40, %rcx
	je	.L122
	call	__stack_chk_fail@PLT
.L122:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE33:
	.size	prscolhex, .-prscolhex
	.globl	urlenc
	.type	urlenc, @function
urlenc:
.LFB34:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$48, %rsp
	movq	%rdi, -40(%rbp)
	movq	-40(%rbp), %rax
	movq	%rax, %rdi
	call	strhex
	movq	%rax, -40(%rbp)
	movq	-40(%rbp), %rax
	movq	%rax, %rdi
	call	cslen
	movq	%rax, -24(%rbp)
	movq	-24(%rbp), %rax
	shrq	%rax
	movq	%rax, %rdx
	movq	-24(%rbp), %rax
	addq	%rdx, %rax
	movq	%rax, %rdi
	call	mlcstr
	movq	%rax, -16(%rbp)
	movq	$0, -32(%rbp)
	jmp	.L125
.L130:
	movq	-32(%rbp), %rax
	testq	%rax, %rax
	js	.L126
	cvtsi2sdq	%rax, %xmm0
	jmp	.L127
.L126:
	movq	%rax, %rdx
	shrq	%rdx
	andl	$1, %eax
	orq	%rax, %rdx
	cvtsi2sdq	%rdx, %xmm0
	addsd	%xmm0, %xmm0
.L127:
	movsd	.LC1814(%rip), %xmm1
	mulsd	%xmm1, %xmm0
	comisd	.LC1815(%rip), %xmm0
	jnb	.L128
	cvttsd2siq	%xmm0, %rax
	movq	%rax, -8(%rbp)
	jmp	.L129
.L128:
	movsd	.LC1815(%rip), %xmm1
	subsd	%xmm1, %xmm0
	cvttsd2siq	%xmm0, %rax
	movq	%rax, -8(%rbp)
	movabsq	$-9223372036854775808, %rax
	xorq	%rax, -8(%rbp)
.L129:
	movq	-8(%rbp), %rax
	movq	%rax, -8(%rbp)
	movq	-16(%rbp), %rdx
	movq	-8(%rbp), %rax
	addq	%rdx, %rax
	movb	$37, (%rax)
	movq	-40(%rbp), %rdx
	movq	-32(%rbp), %rax
	addq	%rdx, %rax
	movq	-8(%rbp), %rdx
	leaq	1(%rdx), %rcx
	movq	-16(%rbp), %rdx
	addq	%rcx, %rdx
	movzbl	(%rax), %eax
	movb	%al, (%rdx)
	movq	-32(%rbp), %rax
	leaq	1(%rax), %rdx
	movq	-40(%rbp), %rax
	addq	%rdx, %rax
	movq	-8(%rbp), %rdx
	leaq	2(%rdx), %rcx
	movq	-16(%rbp), %rdx
	addq	%rcx, %rdx
	movzbl	(%rax), %eax
	movb	%al, (%rdx)
	addq	$2, -32(%rbp)
.L125:
	movq	-32(%rbp), %rax
	cmpq	-24(%rbp), %rax
	jb	.L130
	movq	-16(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE34:
	.size	urlenc, .-urlenc
	.globl	main
	.type	main, @function
main:
.LFB35:
	.cfi_startproc
	endbr64
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	%edi, -4(%rbp)
	movq	%rsi, -16(%rbp)
	movq	-16(%rbp), %rax
	addq	$8, %rax
	movq	(%rax), %rax
	movq	%rax, %rdi
	call	csb64
	movq	%rax, %rdi
	call	puts@PLT
	movq	-16(%rbp), %rax
	addq	$8, %rax
	movq	(%rax), %rax
	movq	%rax, %rdi
	call	urlb64
	movq	%rax, %rdi
	call	puts@PLT
	movl	$0, %eax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE35:
	.size	main, .-main
	.section	.rodata
	.type	__PRETTY_FUNCTION__.2477, @object
	.size	__PRETTY_FUNCTION__.2477, 7
__PRETTY_FUNCTION__.2477:
	.string	"ptrlen"
	.type	__PRETTY_FUNCTION__.2486, @object
	.size	__PRETTY_FUNCTION__.2486, 6
__PRETTY_FUNCTION__.2486:
	.string	"cslen"
	.type	__PRETTY_FUNCTION__.2494, @object
	.size	__PRETTY_FUNCTION__.2494, 5
__PRETTY_FUNCTION__.2494:
	.string	"csup"
	.type	__PRETTY_FUNCTION__.2502, @object
	.size	__PRETTY_FUNCTION__.2502, 6
__PRETTY_FUNCTION__.2502:
	.string	"cslow"
	.type	__PRETTY_FUNCTION__.2510, @object
	.size	__PRETTY_FUNCTION__.2510, 7
__PRETTY_FUNCTION__.2510:
	.string	"cscrev"
	.type	__PRETTY_FUNCTION__.2519, @object
	.size	__PRETTY_FUNCTION__.2519, 6
__PRETTY_FUNCTION__.2519:
	.string	"cscpy"
	.type	__PRETTY_FUNCTION__.2529, @object
	.size	__PRETTY_FUNCTION__.2529, 7
__PRETTY_FUNCTION__.2529:
	.string	"strsub"
	.align 8
	.type	__PRETTY_FUNCTION__.2541, @object
	.size	__PRETTY_FUNCTION__.2541, 8
__PRETTY_FUNCTION__.2541:
	.string	"strepch"
	.align 8
	.type	__PRETTY_FUNCTION__.2556, @object
	.size	__PRETTY_FUNCTION__.2556, 8
__PRETTY_FUNCTION__.2556:
	.string	"strmlen"
	.type	__PRETTY_FUNCTION__.2560, @object
	.size	__PRETTY_FUNCTION__.2560, 7
__PRETTY_FUNCTION__.2560:
	.string	"strmcs"
	.align 8
	.type	__PRETTY_FUNCTION__.2809, @object
	.size	__PRETTY_FUNCTION__.2809, 9
__PRETTY_FUNCTION__.2809:
	.string	"acolprnt"
	.align 8
	.type	__PRETTY_FUNCTION__.2839, @object
	.size	__PRETTY_FUNCTION__.2839, 8
__PRETTY_FUNCTION__.2839:
	.string	"mestyof"
	.type	__PRETTY_FUNCTION__.2848, @object
	.size	__PRETTY_FUNCTION__.2848, 7
__PRETTY_FUNCTION__.2848:
	.string	"fextof"
	.align 8
.LC1814:
	.long	0
	.long	1073217536
	.align 8
.LC1815:
	.long	0
	.long	1138753536
	.ident	"GCC: (Ubuntu 9.3.0-10ubuntu2) 9.3.0"
	.section	.note.GNU-stack,"",@progbits
	.section	.note.gnu.property,"a"
	.align 8
	.long	 1f - 0f
	.long	 4f - 1f
	.long	 5
0:
	.string	 "GNU"
1:
	.align 8
	.long	 0xc0000002
	.long	 3f - 2f
2:
	.long	 0x3
3:
	.align 8
4:
