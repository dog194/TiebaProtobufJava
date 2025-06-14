package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AlaStageDislikeInfo extends Message {
    public static final Integer DEFAULT_DISLIKE_ID = 0;
    public static final String DEFAULT_DISLIKE_REASON = "";

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer dislike_id;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String dislike_reason;

    public static final class Builder extends Message.Builder<AlaStageDislikeInfo> {
        public Integer dislike_id;
        public String dislike_reason;

        public Builder() {
        }

        public Builder(AlaStageDislikeInfo alaStageDislikeInfo) {
            super(alaStageDislikeInfo);
            if (alaStageDislikeInfo == null) {
                return;
            }
            this.dislike_reason = alaStageDislikeInfo.dislike_reason;
            this.dislike_id = alaStageDislikeInfo.dislike_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public AlaStageDislikeInfo build(boolean z) {
            return new AlaStageDislikeInfo(this, z);
        }
    }

    public AlaStageDislikeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.dislike_reason;
            if (str == null) {
                this.dislike_reason = "";
            } else {
                this.dislike_reason = str;
            }
            Integer num = builder.dislike_id;
            if (num == null) {
                this.dislike_id = DEFAULT_DISLIKE_ID;
                return;
            } else {
                this.dislike_id = num;
                return;
            }
        }
        this.dislike_reason = builder.dislike_reason;
        this.dislike_id = builder.dislike_id;
    }
}