package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDate;

/**
 * packageName    : com.example.fastcampusmysql.domain.member.dto
 * fileName       : RegisterMemberCommand
 * author         : GameStop
 * date           : 2023-11-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-23          GameStop             최초 생성
 */
public record RegisterMemberCommand(
    String email,
    String nickname,
    LocalDate birthday
){}
