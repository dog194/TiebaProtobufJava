package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetMemberTaskListResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetMemberTaskListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetMemberTaskListResIdl getMemberTaskListResIdl) {
            super(getMemberTaskListResIdl);
            if (getMemberTaskListResIdl == null) {
                return;
            }
            this.error = getMemberTaskListResIdl.error;
            this.data = getMemberTaskListResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetMemberTaskListResIdl build(boolean z) {
            return new GetMemberTaskListResIdl(this, z);
        }
    }

    public GetMemberTaskListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}