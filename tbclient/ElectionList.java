package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ElectionList extends Message {
    public static final String DEFAULT_APPLY_DECLARATION = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer agree_num;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String apply_declaration;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer apply_id;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer forum_level;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer is_cheat;

    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_pass_audit;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String name_show;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer post_num;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rank;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer thread_num;

    @ProtoField(tag = 12, type = Message.Datatype.INT64)
    public final Long tid;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long uid;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer vote_num;
    public static final Integer DEFAULT_APPLY_ID = 0;
    public static final Integer DEFAULT_RANK = 0;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_FORUM_LEVEL = 0;
    public static final Integer DEFAULT_VOTE_NUM = 0;
    public static final Integer DEFAULT_AGREE_NUM = 0;
    public static final Integer DEFAULT_THREAD_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_IS_CHEAT = 0;
    public static final Integer DEFAULT_IS_PASS_AUDIT = 0;

    public static final class Builder extends Message.Builder<ElectionList> {
        public Integer agree_num;
        public String apply_declaration;
        public Integer apply_id;
        public Integer forum_level;
        public Integer is_cheat;
        public Integer is_pass_audit;
        public String name_show;
        public String portrait;
        public Integer post_num;
        public Integer rank;
        public Integer thread_num;
        public Long tid;
        public Long uid;
        public Integer vote_num;

        public Builder() {
        }

        public Builder(ElectionList electionList) {
            super(electionList);
            if (electionList == null) {
                return;
            }
            this.apply_id = electionList.apply_id;
            this.rank = electionList.rank;
            this.uid = electionList.uid;
            this.portrait = electionList.portrait;
            this.name_show = electionList.name_show;
            this.forum_level = electionList.forum_level;
            this.vote_num = electionList.vote_num;
            this.agree_num = electionList.agree_num;
            this.thread_num = electionList.thread_num;
            this.post_num = electionList.post_num;
            this.apply_declaration = electionList.apply_declaration;
            this.tid = electionList.tid;
            this.is_cheat = electionList.is_cheat;
            this.is_pass_audit = electionList.is_pass_audit;
        }

        @Override // com.squareup.wire.Message.Builder
        public ElectionList build(boolean z) {
            return new ElectionList(this, z);
        }
    }

    public ElectionList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.apply_id;
            if (num == null) {
                this.apply_id = DEFAULT_APPLY_ID;
            } else {
                this.apply_id = num;
            }
            Integer num2 = builder.rank;
            if (num2 == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = num2;
            }
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.name_show;
            if (str2 == null) {
                this.name_show = "";
            } else {
                this.name_show = str2;
            }
            Integer num3 = builder.forum_level;
            if (num3 == null) {
                this.forum_level = DEFAULT_FORUM_LEVEL;
            } else {
                this.forum_level = num3;
            }
            Integer num4 = builder.vote_num;
            if (num4 == null) {
                this.vote_num = DEFAULT_VOTE_NUM;
            } else {
                this.vote_num = num4;
            }
            Integer num5 = builder.agree_num;
            if (num5 == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = num5;
            }
            Integer num6 = builder.thread_num;
            if (num6 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num6;
            }
            Integer num7 = builder.post_num;
            if (num7 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num7;
            }
            String str3 = builder.apply_declaration;
            if (str3 == null) {
                this.apply_declaration = "";
            } else {
                this.apply_declaration = str3;
            }
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l2;
            }
            Integer num8 = builder.is_cheat;
            if (num8 == null) {
                this.is_cheat = DEFAULT_IS_CHEAT;
            } else {
                this.is_cheat = num8;
            }
            Integer num9 = builder.is_pass_audit;
            if (num9 == null) {
                this.is_pass_audit = DEFAULT_IS_PASS_AUDIT;
                return;
            } else {
                this.is_pass_audit = num9;
                return;
            }
        }
        this.apply_id = builder.apply_id;
        this.rank = builder.rank;
        this.uid = builder.uid;
        this.portrait = builder.portrait;
        this.name_show = builder.name_show;
        this.forum_level = builder.forum_level;
        this.vote_num = builder.vote_num;
        this.agree_num = builder.agree_num;
        this.thread_num = builder.thread_num;
        this.post_num = builder.post_num;
        this.apply_declaration = builder.apply_declaration;
        this.tid = builder.tid;
        this.is_cheat = builder.is_cheat;
        this.is_pass_audit = builder.is_pass_audit;
    }
}