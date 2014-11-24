[BITS 16]
[ORG 0x7C00]

; print SHB
mov AL, 83
call printChar
mov AL, 72
call printChar
mov AL, 66
call printChar
mov AL, 13
call printChar
mov AL, 10
call printChar

; hang in infinite loop
jmp $

; printChar prints character in AL
printChar:
  mov AH, 0x0E
  mov BL, 0x07
  mov BH, 0x00
  int 0x10
  ret

; fill rest of code with 0, add intel boot sig
TIMES 512-2 - ($ - $$) db 0
DW 0xAA55
