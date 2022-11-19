main:
push %rbp
mov, rbp
subl -18, %rsp

mov $6, -4(%rbp)
mov $2, -8(%rbp)
mov $3, -12(%rbp)
mov -4(%ebp), %rax
add $1, %rax
add %rax, -16(%ebp)
mov -16(%rbp) , -4(%rbp)
mov -8(%ebp), %rax
add $5, %rax
add %rax, -20(%ebp)
mov -20(%rbp), %rcx
call print
mov $7, %rax
add -12(%ebp), %rax
add %rax, -24(%ebp)
mov -24(%rbp), %rcx
call print
mov %rbp, %rsp
pop %rbp
ret