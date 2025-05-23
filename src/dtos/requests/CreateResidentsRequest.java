package dtos.requests;

import data.models.AccessCode;
import data.models.Resident;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateResidentsRequest {
    private String fullName;
    private String email;
    private String phone;
    private String houseNumber;
    private String occupation;
    private Resident resident;
    private AccessCode accessCode;
}
