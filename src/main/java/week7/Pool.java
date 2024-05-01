package week7;

public class Pool {     // use this pool to make pool objects

    private String name; //field, or a variable
    private double length; //another field or variable
    private String address;     // a string of letters variable named address
    private double maxDepth;     // a number variable named maxDepth for pool depth

    public Pool(String poolName, double poolLength) {  // constructor of Pool object
        name = poolName;       // name parameter
        length = poolLength;   // length parameter
    }           // end of Pool constructor

    // instance method below
    // Instance is another word for an object,
    // an instance of a class
    // A Pool object is an instance of the Pool class
    public double distanceForLaps(int laps) {       // create distanceForLaps method using one argument, laps
        // this method will multiplu laps using length variable
        // 10 laps of pool of length 50, that's 500 meters.
        double total = laps * this.length;      // return calculation to program.
        return total;           // return a number
    }           // end of public distanceForLaps method


    public String toString() {          // toString() constructor for returning a string variable to our user
        // using two local variables, name and length
        String description = name + " pool is " + length + " meters long.";
        return description;
    }       // end of toString constructor

    public String getName() {
        return name;
    }       // our getter method for returning "name" variable

    public void setName(String name) {
        this.name = name;
    }
    // our setter method for setting our "name" variable

    public double getLength() {
        return length;
    }
    // our getter method for returning "length" variable

    public void setLength(double length) {      // our setter method for setting "length" of a pool object
        if (length < 0 || length > 1000) {      // if statement for our setLength method. if length is less than 0,
            return;         // or if length is greater than 1000, return nothing to the main method
        }                   // end of if statement
        this.length = length;           //this only runs if the length is set to the appropriate range of numbers
    }       // end of setLength method

    public String getAddress() {        // our getter method for returning address
        return address;         // return address to program
    }           // end of getAddress method

    public void setAddress(String address) {        // our setter method for setting String variable "address"
        // set our address variable to an object
        this.address = address;
    }       // end of setAddress method

    public double getMaxDepth() {       // our getter method for getting max depth of pool object
        return maxDepth;        // return maxDepth to our user
    }       // end of getMaxDepth method

    public void setMaxDepth(double maxDepth) {      // our setter method for setting max depth of pool object
        this.maxDepth = maxDepth;           // set our instance variable maxDepth for our pool object
    }       // end of setter method
}       // end of public Class "Pool"
