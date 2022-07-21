package com.example.evoting;

public class CandidateModel {
    private String candidateName;
    private String candidateDetails;
    private int imageId;

    public CandidateModel(String candidateName, String candidateDetails, int imageId) {
        this.candidateName = candidateName;
        this.candidateDetails = candidateDetails;
        this.imageId = imageId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateDetails() {
        return candidateDetails;
    }

    public void setCandidateDetails(String candidateDetails) {
        this.candidateDetails = candidateDetails;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
