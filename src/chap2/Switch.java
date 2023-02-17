package chap2;

public class Switch {
    public static void main(String[] args) {
        String season = "spring";
        String message = "";
        switch(season){
            case "summer":
                message = "Summer Season";
                break;

            case "spring":
                message = "Spring Season";
                break;

            default:
                    message = "Other season";
                    // no need break here, will not fall through
            }

            System.out.println(message);

        // new switch
        String taste = "way too hot";
        int tempAdjustment = switch(taste) {
            case "too cold" -> 1;
            case "way too hot" -> -1;
            case "too hot" -> -2;
            default -> 0;
        };
        System.out.println("Temperature adjustment = " + tempAdjustment);
        }




    }



