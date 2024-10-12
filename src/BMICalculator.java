public class BMICalculator {
    private double weightInPounds;
    private double heightInInches;
    private double weightInKilos;
    private double heightInMeters;

    public BMICalculator() {
        this.weightInPounds = 154;
        this.heightInInches = 69;
        this.weightInKilos = 70;
        this.heightInMeters = 1.75;
    }
        public double calculateBmiImperial(double weightInPounds,double heightInInches) {
            this.weightInPounds = weightInPounds;
            this.heightInInches = heightInInches;
            return (this.weightInPounds * 703) / (this.heightInInches * this.heightInInches);
        }
            public double calculateBmiMetric(double weightInKilos,double heightInMeters){
                return this.weightInKilos / (this.heightInMeters * this.heightInMeters);
            }

            public String getBMICategory(double bmi){
            if(bmi < 18.5)
                return "Underweight";
            else if(bmi < 25)
                return "Normal weight";
            else if(bmi < 30)
                return "Underweight";
            else
                return "Obese";
    }
}