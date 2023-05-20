package com.burakkolay.akbankhw2.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author bahadirmemis
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestResponse<T> implements Serializable {

  private T data;
  private LocalDateTime responseDate;
  private boolean isSuccess;
  private String messages;

  public RestResponse(T data, boolean isSuccess) {
    this.data = data;
    this.isSuccess = isSuccess;
    this.responseDate = LocalDateTime.now();
  }

  public RestResponse(boolean isSuccess, String messages) {
    this.isSuccess = isSuccess;
    this.messages = messages;
    this.responseDate = LocalDateTime.now();
  }

  public static <T> RestResponse<T> of(T t){
    return new RestResponse<>(t, true);
  }

  public static <T> RestResponse<T> empty(){
    return new RestResponse<>(null, true);
  }

  public static <T> RestResponse<T> error(T t){
    return new RestResponse<>(t, false);
  }

  public static <T> RestResponse<T> errorMesage(String messages){
    return new RestResponse<>(false,messages);
  }

  public void setMessages(String messages) {
    this.messages = messages;
  }
}
