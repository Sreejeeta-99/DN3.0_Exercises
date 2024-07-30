public class BuilderPatternExample 
{
    // Product class with multiple attributes
    public static class Computer 
    {
        private final String CPU;
        private final int RAM;
        private final int storage;
        private final boolean isSSD;
        private final boolean hasGraphicsCard;

        // Private constructor to be used by the Builder
        private Computer(Builder builder) 
        {
            this.CPU = builder.CPU;
            this.RAM = builder.RAM;
            this.storage = builder.storage;
            this.isSSD = builder.isSSD;
            this.hasGraphicsCard = builder.hasGraphicsCard;
        }

        @Override
        public String toString() 
        {
            return "Computer [CPU=" + CPU + ", RAM=" + RAM + "GB, Storage=" + storage + "GB" +
                   ", SSD=" + isSSD + ", Graphics Card=" + hasGraphicsCard + "]";
        }

        // Static nested Builder class
        public static class Builder 
        {
            private final String CPU; // Required
            private final int RAM; // Required
            private int storage = 0; // Optional
            private boolean isSSD = false; // Optional
            private boolean hasGraphicsCard = false; // Optional

            // Builder constructor with required parameters
            public Builder(String CPU, int RAM) 
            {
                this.CPU = CPU;
                this.RAM = RAM;
            }

            // Methods to set optional parameters
            public Builder setStorage(int storage) 
            {
                this.storage = storage;
                return this;
            }

            public Builder setSSD(boolean isSSD) 
            {
                this.isSSD = isSSD;
                return this;
            }

            public Builder setGraphicsCard(boolean hasGraphicsCard) 
            {
                this.hasGraphicsCard = hasGraphicsCard;
                return this;
            }

            // Build method to return the final Computer instance
            public Computer build() 
            {
                return new Computer(this);
            }
        }
    }

    // Test class to demonstrate the Builder Pattern
    public static void main(String[] args) 
    {
        // Create a basic Computer with only required attributes
        Computer basicComputer = new Computer.Builder("Intel i5", 8)
            .build(); // build() method is called on the Builder instance
        System.out.println("Basic Computer: " + basicComputer);

        // Create a high-end Computer with all optional attributes
        Computer highEndComputer = new Computer.Builder("Intel i9", 16)
            .setStorage(512)
            .setSSD(true)
            .setGraphicsCard(true)
            .build();
        System.out.println("High-End Computer: " + highEndComputer);
    }
}
