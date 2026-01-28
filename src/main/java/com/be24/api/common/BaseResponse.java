package com.be24.api.common;
/*
 *   {success: true, code: 1000, message: '아이디 비밀번호를 확인해주세요', result: 실제 응답 객체}
 *
 */
// 제네릭 클래스 선언, 클래스 내부에서 T를 필드 타입으로 사용하기 위해 <T>로 선언
public class BaseResponse<T> {
    private Boolean success;
    private Integer code;
    private String message;
    private T result;
    // <T>를 쓴 이유는 result가 어떤 타입이든 될 수 있기 때문

    public BaseResponse(Boolean success, Integer code, String message, T result) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public static <T> BaseResponse success(T result) {
        return new BaseResponse(true, 1000, "성공", result);
    }

    public static <T> BaseResponse fail(T result) {
        return new BaseResponse(false, 4000, "실패", result);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
