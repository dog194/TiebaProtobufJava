package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ForumHeadlineImgInfo extends Message {
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_IMG_USER_NAME = "";
    public static final String DEFAULT_RANK_UP_INFO = "";
    public static final String DEFAULT_RANK_URL = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_url;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long img_user_id;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_user_name;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rank_num;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String rank_up_info;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String rank_url;
    public static final Integer DEFAULT_RANK_NUM = 0;
    public static final Long DEFAULT_IMG_USER_ID = 0L;

    public static final class Builder extends Message.Builder<ForumHeadlineImgInfo> {
        public String img_url;
        public Long img_user_id;
        public String img_user_name;
        public Integer rank_num;
        public String rank_up_info;
        public String rank_url;

        public Builder() {
        }

        public Builder(ForumHeadlineImgInfo forumHeadlineImgInfo) {
            super(forumHeadlineImgInfo);
            if (forumHeadlineImgInfo == null) {
                return;
            }
            this.img_user_name = forumHeadlineImgInfo.img_user_name;
            this.img_url = forumHeadlineImgInfo.img_url;
            this.rank_num = forumHeadlineImgInfo.rank_num;
            this.img_user_id = forumHeadlineImgInfo.img_user_id;
            this.rank_url = forumHeadlineImgInfo.rank_url;
            this.rank_up_info = forumHeadlineImgInfo.rank_up_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public ForumHeadlineImgInfo build(boolean z) {
            return new ForumHeadlineImgInfo(this, z);
        }
    }

    public ForumHeadlineImgInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img_user_name;
            if (str == null) {
                this.img_user_name = "";
            } else {
                this.img_user_name = str;
            }
            String str2 = builder.img_url;
            if (str2 == null) {
                this.img_url = "";
            } else {
                this.img_url = str2;
            }
            Integer num = builder.rank_num;
            if (num == null) {
                this.rank_num = DEFAULT_RANK_NUM;
            } else {
                this.rank_num = num;
            }
            Long l = builder.img_user_id;
            if (l == null) {
                this.img_user_id = DEFAULT_IMG_USER_ID;
            } else {
                this.img_user_id = l;
            }
            String str3 = builder.rank_url;
            if (str3 == null) {
                this.rank_url = "";
            } else {
                this.rank_url = str3;
            }
            String str4 = builder.rank_up_info;
            if (str4 == null) {
                this.rank_up_info = "";
                return;
            } else {
                this.rank_up_info = str4;
                return;
            }
        }
        this.img_user_name = builder.img_user_name;
        this.img_url = builder.img_url;
        this.rank_num = builder.rank_num;
        this.img_user_id = builder.img_user_id;
        this.rank_url = builder.rank_url;
        this.rank_up_info = builder.rank_up_info;
    }
}