package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class RecomUserInfo extends Message {
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_POS_NAME = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<CommonForum> common_forum;

    @ProtoField(tag = 6)
    public final CommonDistance distanceinfo;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String message;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pos_name;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PostInfo> post_info;

    @ProtoField(tag = 1)
    public final UserInfo user_info;
    public static final List<CommonForum> DEFAULT_COMMON_FORUM = Collections.emptyList();
    public static final List<PostInfo> DEFAULT_POST_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<RecomUserInfo> {
        public List<CommonForum> common_forum;
        public CommonDistance distanceinfo;
        public String message;
        public String pos_name;
        public List<PostInfo> post_info;
        public UserInfo user_info;

        public Builder() {
        }

        public Builder(RecomUserInfo recomUserInfo) {
            super(recomUserInfo);
            if (recomUserInfo == null) {
                return;
            }
            this.user_info = recomUserInfo.user_info;
            this.common_forum = Message.copyOf(recomUserInfo.common_forum);
            this.post_info = Message.copyOf(recomUserInfo.post_info);
            this.pos_name = recomUserInfo.pos_name;
            this.message = recomUserInfo.message;
            this.distanceinfo = recomUserInfo.distanceinfo;
        }

        @Override // com.squareup.wire.Message.Builder
        public RecomUserInfo build(boolean z) {
            return new RecomUserInfo(this, z);
        }
    }

    public RecomUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            List<CommonForum> list = builder.common_forum;
            if (list == null) {
                this.common_forum = DEFAULT_COMMON_FORUM;
            } else {
                this.common_forum = Message.immutableCopyOf(list);
            }
            List<PostInfo> list2 = builder.post_info;
            if (list2 == null) {
                this.post_info = DEFAULT_POST_INFO;
            } else {
                this.post_info = Message.immutableCopyOf(list2);
            }
            String str = builder.pos_name;
            if (str == null) {
                this.pos_name = "";
            } else {
                this.pos_name = str;
            }
            String str2 = builder.message;
            if (str2 == null) {
                this.message = "";
            } else {
                this.message = str2;
            }
            this.distanceinfo = builder.distanceinfo;
            return;
        }
        this.user_info = builder.user_info;
        this.common_forum = Message.immutableCopyOf(builder.common_forum);
        this.post_info = Message.immutableCopyOf(builder.post_info);
        this.pos_name = builder.pos_name;
        this.message = builder.message;
        this.distanceinfo = builder.distanceinfo;
    }
}