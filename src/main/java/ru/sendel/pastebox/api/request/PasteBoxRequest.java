package ru.sendel.pastebox.api.request;


import lombok.Data;

@Data
public class PasteBoxRequest {
    private String data;
    private Long expirationsTomeSeconds;
    private PublicStatus publicStatus;
}
