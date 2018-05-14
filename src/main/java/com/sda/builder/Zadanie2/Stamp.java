package com.sda.builder.Zadanie2;

public class Stamp {
    private int firstDayNumber;
    private int secondDayNumber;
    private int firstMonthNumber;
    private int secondMonthNumber;
    private int yearNumber1;
    private int yearNumber2;
    private int yearNumber3;
    private int yearNumber4;
    private int caseNumber;

    public Stamp(int firstDayNumber, int secondDayNumber, int firstMonthNumber, int secondMonthNumber, int yearNumber1, int yearNumber2,
                 int yearNumber3, int yearNumber4, int caseNumber) {
        this.firstDayNumber = firstDayNumber;
        this.secondDayNumber = secondDayNumber;
        this.firstMonthNumber = firstMonthNumber;
        this.secondMonthNumber = secondMonthNumber;
        this.yearNumber1 = yearNumber1;
        this.yearNumber2 = yearNumber2;
        this.yearNumber3 = yearNumber3;
        this.yearNumber4 = yearNumber4;
        this.caseNumber = caseNumber;
    }

    @Override
    public String toString() {
        return (firstDayNumber + "" + secondDayNumber + "-" + firstMonthNumber + secondMonthNumber + "-" +
                yearNumber1 + yearNumber2 + yearNumber3 + yearNumber4 + ":" + caseNumber);

    }

    public static class Builder {

        private int firstDayNumber = 0;
        private int secondDayNumber = 8;
        private int firstMonthNumber = 0;
        private int secondMonthNumber = 5;
        private int yearNumber1 = 2;
        private int yearNumber2 = 0;
        private int yearNumber3 = 1;
        private int yearNumber4 = 8;
        private int caseNumber = 1;

        public Builder setFirstDayNumber(int firstDayNumber) {
            this.firstDayNumber = firstDayNumber;
            return this;
        }

        public Builder setSecondDayNumber(int secondDayNumber) {
            this.secondDayNumber = secondDayNumber;
            return this;
        }

        public Builder setFirstMonthNumber(int firstMonthNumber) {
            this.firstMonthNumber = firstMonthNumber;
            return this;
        }

        public Builder setSecondMonthNumber(int secondMonthNumber) {
            this.secondMonthNumber = secondMonthNumber;
            return this;
        }

        public Builder setYearNumber1(int yearNumber1) {
            this.yearNumber1 = yearNumber1;
            return this;
        }

        public Builder setYearNumber2(int yearNumber2) {
            this.yearNumber2 = yearNumber2;
            return this;
        }

        public Builder setYearNumber3(int yearNumber3) {
            this.yearNumber3 = yearNumber3;
            return this;
        }

        public Builder setYearNumber4(int yearNumber4) {
            this.yearNumber4 = yearNumber4;
            return this;
        }

        public Builder setCaseNumber(int caseNumber) {
            this.caseNumber = caseNumber;
            return this;
        }

        public Stamp createStamp() {
            return new Stamp(firstDayNumber, secondDayNumber, firstMonthNumber, secondMonthNumber, yearNumber1, yearNumber2, yearNumber3, yearNumber4, caseNumber);
        }

    }

}
