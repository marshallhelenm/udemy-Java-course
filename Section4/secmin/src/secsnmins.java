public class secsnmins {

        public static void main(String[] args){
            System.out.println(getDurationString(65, 45));
            System.out.println(getDurationString(3945L));
        }

        private static String getDurationString(long minutes, long seconds){

            if (minutes <= 0 || seconds <= 0 || seconds > 59){
                return "invalid value";
            };
            long allSecs = minutes * 60 + seconds;
            long hours = allSecs / 3600;
            long newMins = allSecs % 3600 / 60;
            long lastSecs = allSecs % 3600 % 60;

            if (hours < 10){
                if (newMins < 10){
                    if (lastSecs < 10){
                        return "0" + hours +  "h " + "0" + newMins + "m " + "0" + lastSecs + "s";
                    }
                    return "0" + hours +  "h " + "0" + newMins + "m " + lastSecs + "s";
                }
                return "0" + hours + "h " + newMins + "m " + lastSecs + "s";
            }

            return hours + "h " + newMins + "m " + lastSecs + "s";
        };

        private static String getDurationString(long seconds){
            if (seconds <0 ){
                return "invalide value";
            };

            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            return getDurationString(minutes, remainingSeconds);
        };



}
