package Request;


public class RcDeprecated {

        private static final String BODY = "https://api.vk.com/method/";
        private static final String TOKEN ="access_token=";/*+VKSdk.getAccessToken().accessToken;*/


       // String request = RequestCreator.vkRequest(VkMethod.USERS_GET,VkParams.param(key,value),VkParams.param(key,value));
       //https://api.vk.com/method/users.get?user_ids=205387401&fields=photo_id,online&access_token=21b4263f21f0a83d6cdfd31d66a18d8d9eaf6978774d21c7d21a2f0a452c773c49fb1afd176aa0b4620fd

        public static String vkRequest(String vkMethod, VkParams... params){
            StringBuilder sb = new StringBuilder();
            sb.append(BODY).append(vkMethod).append("?");

                // Бежим по массиму params
            for (VkParams param : params) {
                // Если используется value
                if (param.isValue) {
                    sb.append(param.key).append("=");
                    // Бежим по массиму pavarm.value до предпоследнего элемента
                    for (int j = 0; j < param.value.length - 1; j++) {
                        sb.append(param.value[j]).append(",");
                    }

                    sb.append(param.value[param.value.length - 1]).append("&").append(TOKEN);
                } else {
                    sb.append(param.key).append("=");
                    for (int j = 0; j < param.usersIDorNameCase.length - 1; j++) {
                        sb.append(param.usersIDorNameCase[j]).append(",");
                    }

                    sb.append(param.usersIDorNameCase[param.usersIDorNameCase.length - 1]).append("&").append(TOKEN);
                }
            }


            return sb.toString();
        }


    public static void main(String[] args) {
        System.out.println(vkRequest
                (VkMethod.USERS_GET,
                        VkParams.addParameter(VkParams.USERS_GET_key.fields,
                                              VkParams.U_G_FIELDS_values.about,
                                              VkParams.U_G_FIELDS_values.activities,
                                              VkParams.U_G_FIELDS_values.blacklisted),
                        VkParams.addParameter(VkParams.USERS_GET_key.user_ids,
                                              "1451511",
                                              "12612567")
                )
        );
    }




}
