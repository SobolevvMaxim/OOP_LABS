package com.company;

import java.util.Objects;

public class Pupil extends AbstractStudent {
    private String profile;

    public Pupil(String FIO, int rating) {
        super(FIO, rating);
    }

    public Pupil(String FIO) {
        super(FIO);
    }

    public Pupil(String FIO, int rating, String profile) {
        super(FIO, rating);
        profile = profile;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pupil pupil = (Pupil) o;
        return Objects.equals(profile, pupil.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), profile);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "FIO='" + FIO + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }
}
