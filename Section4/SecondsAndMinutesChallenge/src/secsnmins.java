public class secsnmins {

        public static void main(String[] args){
            System.out.println(getDurationString(65, 45));
            System.out.println(getDurationString(66666));
        }

        private static String getDurationString(long minutes, long seconds){

            if (minutes <= 0 || seconds <= 0 || seconds > 59){
                return "invalid value";
            };
            long allSecs = minutes * 60 + seconds;
            long hours = allSecs / 3600;
            long newMins = allSecs % 3600 / 60;
            long lastSecs = allSecs % 3600 % 60;

            return hours + "h " + newMins + "m " + lastSecs + "s";
        };

        private static String getDurationString(long seconds){
            if (seconds <0 ){
                return "invalide value";
            };
            long hours = seconds / 3600;
            long minutes = seconds % 3600 / 60;
            long lastSecs = seconds % 3600 % 60;

            return hours + "h " + minutes + "m " + lastSecs + "s";
        };



}
