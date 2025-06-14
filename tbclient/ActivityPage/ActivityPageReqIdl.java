package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ActivityPageReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<ActivityPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ActivityPageReqIdl activityPageReqIdl) {
            super(activityPageReqIdl);
            if (activityPageReqIdl == null) {
                return;
            }
            this.data = activityPageReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActivityPageReqIdl build(boolean z) {
            return new ActivityPageReqIdl(this, z);
        }
    }

    public ActivityPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}