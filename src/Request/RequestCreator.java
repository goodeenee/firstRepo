package Request;


public class RequestCreator {

        private static final String BODY = "https://api.vk.com/method/";
        private static final String TOKEN ="access_token=";/*+VKSdk.getAccessToken().accessToken;*/
        public static final String USERS_GET="users.get";


       // String request = RequestCreator.vkRequest(VkMethod.USERS_GET,VkParams.param(key,value),VkParams.param(key,value));
       //https://api.vk.com/method/users.get?user_ids=205387401&fields=photo_id,online&access_token=21b4263f21f0a83d6cdfd31d66a18d8d9eaf6978774d21c7d21a2f0a452c773c49fb1afd176aa0b4620fd

        public static String vkRequest(String method, VkParams... params){
            StringBuilder sb = new StringBuilder();
            sb.append(BODY).append(method).append("?");
            for (VkParams param : params) {
                sb.append(param.getKey()).append("=").append(param.getValue()).append("&");
            }
            sb.append(TOKEN);
            return sb.toString();
        }

    public static String getUsersRequestString(VkParams... params){
        return vkRequest(VkMethod.USERS_GET,params);
    }


    public static void main(String[] args) {
        System.out.println(vkRequest
                (VkMethod.USERS_GET, VkParams.addParameter(VkParams.OFFSET,"25"),VkParams.addParameter(VkParams.FIELDS,VkParams.FIELD.career.toString()+","+VkParams.FIELD.activities)));


    }




}
