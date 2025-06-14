package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ManagerElection extends Message {
    public static final String DEFAULT_TAIL_TEXT = "";

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer begin_vote_time;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer can_vote;

    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_show_distribute;

    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer remainder_time;

    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer status;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tail_text;

    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> vote_condition;

    @ProtoField(label = Message.Label.REPEATED, tag = 11, type = Message.Datatype.STRING)
    public final List<String> vote_condition_pic;

    @ProtoField(label = Message.Label.REPEATED, tag = 10, type = Message.Datatype.STRING)
    public final List<String> vote_condition_title;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer vote_num;
    public static final Integer DEFAULT_CAN_VOTE = 0;
    public static final Integer DEFAULT_VOTE_NUM = 0;
    public static final Integer DEFAULT_BEGIN_VOTE_TIME = 0;
    public static final List<String> DEFAULT_VOTE_CONDITION = Collections.emptyList();
    public static final Integer DEFAULT_IS_SHOW_DISTRIBUTE = 0;
    public static final Integer DEFAULT_REMAINDER_TIME = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final List<String> DEFAULT_VOTE_CONDITION_TITLE = Collections.emptyList();
    public static final List<String> DEFAULT_VOTE_CONDITION_PIC = Collections.emptyList();

    public static final class Builder extends Message.Builder<ManagerElection> {
        public Integer begin_vote_time;
        public Integer can_vote;
        public Integer is_show_distribute;
        public Integer remainder_time;
        public Integer status;
        public String tail_text;
        public List<String> vote_condition;
        public List<String> vote_condition_pic;
        public List<String> vote_condition_title;
        public Integer vote_num;

        public Builder() {
        }

        public Builder(ManagerElection managerElection) {
            super(managerElection);
            if (managerElection == null) {
                return;
            }
            this.can_vote = managerElection.can_vote;
            this.vote_num = managerElection.vote_num;
            this.begin_vote_time = managerElection.begin_vote_time;
            this.vote_condition = Message.copyOf(managerElection.vote_condition);
            this.tail_text = managerElection.tail_text;
            this.is_show_distribute = managerElection.is_show_distribute;
            this.remainder_time = managerElection.remainder_time;
            this.status = managerElection.status;
            this.vote_condition_title = Message.copyOf(managerElection.vote_condition_title);
            this.vote_condition_pic = Message.copyOf(managerElection.vote_condition_pic);
        }

        @Override // com.squareup.wire.Message.Builder
        public ManagerElection build(boolean z) {
            return new ManagerElection(this, z);
        }
    }

    public ManagerElection(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.can_vote;
            if (num == null) {
                this.can_vote = DEFAULT_CAN_VOTE;
            } else {
                this.can_vote = num;
            }
            Integer num2 = builder.vote_num;
            if (num2 == null) {
                this.vote_num = DEFAULT_VOTE_NUM;
            } else {
                this.vote_num = num2;
            }
            Integer num3 = builder.begin_vote_time;
            if (num3 == null) {
                this.begin_vote_time = DEFAULT_BEGIN_VOTE_TIME;
            } else {
                this.begin_vote_time = num3;
            }
            List<String> list = builder.vote_condition;
            if (list == null) {
                this.vote_condition = DEFAULT_VOTE_CONDITION;
            } else {
                this.vote_condition = Message.immutableCopyOf(list);
            }
            String str = builder.tail_text;
            if (str == null) {
                this.tail_text = "";
            } else {
                this.tail_text = str;
            }
            Integer num4 = builder.is_show_distribute;
            if (num4 == null) {
                this.is_show_distribute = DEFAULT_IS_SHOW_DISTRIBUTE;
            } else {
                this.is_show_distribute = num4;
            }
            Integer num5 = builder.remainder_time;
            if (num5 == null) {
                this.remainder_time = DEFAULT_REMAINDER_TIME;
            } else {
                this.remainder_time = num5;
            }
            Integer num6 = builder.status;
            if (num6 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num6;
            }
            List<String> list2 = builder.vote_condition_title;
            if (list2 == null) {
                this.vote_condition_title = DEFAULT_VOTE_CONDITION_TITLE;
            } else {
                this.vote_condition_title = Message.immutableCopyOf(list2);
            }
            List<String> list3 = builder.vote_condition_pic;
            if (list3 == null) {
                this.vote_condition_pic = DEFAULT_VOTE_CONDITION_PIC;
                return;
            } else {
                this.vote_condition_pic = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.can_vote = builder.can_vote;
        this.vote_num = builder.vote_num;
        this.begin_vote_time = builder.begin_vote_time;
        this.vote_condition = Message.immutableCopyOf(builder.vote_condition);
        this.tail_text = builder.tail_text;
        this.is_show_distribute = builder.is_show_distribute;
        this.remainder_time = builder.remainder_time;
        this.status = builder.status;
        this.vote_condition_title = Message.immutableCopyOf(builder.vote_condition_title);
        this.vote_condition_pic = Message.immutableCopyOf(builder.vote_condition_pic);
    }
}