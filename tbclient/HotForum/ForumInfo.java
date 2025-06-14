package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long member_count;

    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long thread_count;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long time_out;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_TIME_OUT = 0L;
    public static final Long DEFAULT_MEMBER_COUNT = 0L;
    public static final Long DEFAULT_THREAD_COUNT = 0L;

    public static final class Builder extends Message.Builder<ForumInfo> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Long member_count;
        public Long thread_count;
        public Long time_out;

        public Builder() {
        }

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo == null) {
                return;
            }
            this.forum_id = forumInfo.forum_id;
            this.forum_name = forumInfo.forum_name;
            this.avatar = forumInfo.avatar;
            this.time_out = forumInfo.time_out;
            this.member_count = forumInfo.member_count;
            this.thread_count = forumInfo.thread_count;
        }

        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z);
        }
    }

    public ForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Long l2 = builder.time_out;
            if (l2 == null) {
                this.time_out = DEFAULT_TIME_OUT;
            } else {
                this.time_out = l2;
            }
            Long l3 = builder.member_count;
            if (l3 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = l3;
            }
            Long l4 = builder.thread_count;
            if (l4 == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
                return;
            } else {
                this.thread_count = l4;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.time_out = builder.time_out;
        this.member_count = builder.member_count;
        this.thread_count = builder.thread_count;
    }
}