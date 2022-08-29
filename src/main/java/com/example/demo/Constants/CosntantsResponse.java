package com.example.demo.Constants;



public class CosntantsResponse {

            String successful= "0000";

            String Number_Format_Error= "1002";
    String Balance_not_enioght= "1001";
    String onlyPrepaid= "1003";
    String onlyPostpaid = "1004";
    String cannot_sub_same_service_withi_oneDay= "1005";
    String reachAndLimitTheNumberofTimes= "1006";
    String alreadySubc= "1007";

    public String getAlreadySubc() {
        return alreadySubc;
    }

    public String getForbidSub() {
        return forbidSub;
    }

    public String getYourPlanCannot_subThisService() {
        return yourPlanCannot_subThisService;
    }

    public String getTherIsNoThisService() {
        return therIsNoThisService;
    }

    public String getCommand_format_is_incorrect() {
        return Command_format_is_incorrect;
    }

    public String getOther_errors() {
        return other_errors;
    }

    public String getSuccessful() {
        return successful;
    }

    public String getNumber_Format_Error() {
        return Number_Format_Error;
    }

    public String getBalance_not_enioght() {
        return Balance_not_enioght;
    }

    public String getOnlyPrepaid() {
        return onlyPrepaid;
    }

    public String getOnlyPostpaid() {
        return onlyPostpaid;
    }

    public String getCannot_sub_same_service_withi_oneDay() {
        return cannot_sub_same_service_withi_oneDay;
    }

    public String getReachAndLimitTheNumberofTimes() {
        return reachAndLimitTheNumberofTimes;
    }

    String forbidSub = "1008";
    String yourPlanCannot_subThisService= "1009";
    String therIsNoThisService ="1010";
    String Command_format_is_incorrect ="1011";
    String other_errors = "1009";

}
