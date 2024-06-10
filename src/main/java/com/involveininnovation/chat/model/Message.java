package com.involveininnovation.chat.model;

import lombok.*;

import java.sql.Blob;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;
    private Blob file;
}
