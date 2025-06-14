package tbclient.GetHorseRaceLampList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LiveList extends Message {
    public static final String DEFAULT_LIVE_TITLE = "";
    public static final String DEFAULT_USER_NICKNAME = "";

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer amount;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long live_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String live_title;

    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long rob_end_tm;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer screen_direction;

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long user_id;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_nickname;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_AMOUNT = 0;
    public static final Long DEFAULT_ROB_END_TM = 0L;
    public static final Integer DEFAULT_SCREEN_DIRECTION = 0;

    public static final class Builder extends Message.Builder<LiveList> {
        public Integer amount;
        public Long live_id;
        public String live_title;
        public Long rob_end_tm;
        public Integer screen_direction;
        public Long user_id;
        public String user_nickname;

        public Builder() {
        }

        public Builder(LiveList liveList) {
            super(liveList);
            if (liveList == null) {
                return;
            }
            this.live_id = liveList.live_id;
            this.live_title = liveList.live_title;
            this.user_id = liveList.user_id;
            this.user_nickname = liveList.user_nickname;
            this.amount = liveList.amount;
            this.rob_end_tm = liveList.rob_end_tm;
            this.screen_direction = liveList.screen_direction;
        }

        @Override // com.squareup.wire.Message.Builder
        public LiveList build(boolean z) {
            return new LiveList(this, z);
        }
    }

    public LiveList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.live_id;
            if (l == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l;
            }
            String str = builder.live_title;
            if (str == null) {
                this.live_title = "";
            } else {
                this.live_title = str;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            String str2 = builder.user_nickname;
            if (str2 == null) {
                this.user_nickname = "";
            } else {
                this.user_nickname = str2;
            }
            Integer num = builder.amount;
            if (num == null) {
                this.amount = DEFAULT_AMOUNT;
            } else {
                this.amount = num;
            }
            Long l3 = builder.rob_end_tm;
            if (l3 == null) {
                this.rob_end_tm = DEFAULT_ROB_END_TM;
            } else {
                this.rob_end_tm = l3;
            }
            Integer num2 = builder.screen_direction;
            if (num2 == null) {
                this.screen_direction = DEFAULT_SCREEN_DIRECTION;
                return;
            } else {
                this.screen_direction = num2;
                return;
            }
        }
        this.live_id = builder.live_id;
        this.live_title = builder.live_title;
        this.user_id = builder.user_id;
        this.user_nickname = builder.user_nickname;
        this.amount = builder.amount;
        this.rob_end_tm = builder.rob_end_tm;
        this.screen_direction = builder.screen_direction;
    }
}