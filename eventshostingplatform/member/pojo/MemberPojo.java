package com.lowesforgeeks.eventshostingplatform.member.pojo;

import java.io.Serializable;

public class MemberPojo implements Serializable {
    private Long memberId;
    private String firstName;
    private String lastName;

    public Long getMemberId() {
        return memberId;
    }

    public MemberPojo(Long memberId, String firstName,String lastName){
        setMemberId(memberId);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
