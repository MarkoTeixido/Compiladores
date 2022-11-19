main:
push %rbp
mov, rbp
subl -18, %rsp

mov $6, -4(%rbp)
mov $2, -8(%rbp)
mov -4(%ebp), %rax
add $1, %rax
add %rax, -12(%ebp)
mov -12(%rbp) , -4(%rbp)
mov -8(%rbp), %rcx
call print
mov $7, %rcx
call print
mov %rbp, %rsp
pop %rbp
ret