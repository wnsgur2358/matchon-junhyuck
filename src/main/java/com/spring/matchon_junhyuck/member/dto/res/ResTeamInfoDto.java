package com.spring.matchon_junhyuck.member.dto.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResTeamInfoDto {
    private String teamName;
    private String teamIntro;
}
