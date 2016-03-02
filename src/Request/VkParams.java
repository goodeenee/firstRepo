package Request;


public class VkParams {
    public USERS_GET_key key = null;
    public U_G_FIELDS_values[] value = null;
    public String[] usersIDorNameCase = null;
    // Flag for vkRequest method.
    public boolean isValue = false;

    public VkParams(USERS_GET_key key, U_G_FIELDS_values[] value) {
        this.key = key;
        this.value = value;
        isValue = true;
    }
    public VkParams(USERS_GET_key key, String[] usersIDorNameCase) {
        this.key = key;
        this.usersIDorNameCase = usersIDorNameCase;
    }



    enum USERS_GET_key {
        user_ids,
        fields,
        name_case
    }
    enum U_G_FIELDS_values {
        photo_id, verified, sex, bdate, city, country, home_town, has_photo, photo_50,
        photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig,
        online, lists, domain, has_mobile, contacts, site, education, universities,
        schools, status, last_seen, followers_count, common_count, occupation, nickname,
        relatives, relation, personal, connections, exports, wall_comments, activities,
        interests, music, movies, tv, books, games, about, quotes, can_post, can_see_all_posts,
        can_see_audio, can_write_private_message, can_send_friend_request, is_favorite,
        is_hidden_from_feed, timezone, screen_name, maiden_name, crop_photo, is_friend,
        friend_status, career, military, blacklisted, blacklisted_by_me
    }
    static VkParams addParameter(USERS_GET_key key , U_G_FIELDS_values... value){
        return new VkParams(key,value);
    }

    static VkParams addParameter(USERS_GET_key key , String... usersIDorNameCase){
        return new VkParams(key, usersIDorNameCase);
    }
}
