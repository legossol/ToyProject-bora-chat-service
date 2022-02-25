package kr.legossol.borachat.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MessageDto {
    private Long id;
    private String message;
    private String sendedTime;

}
