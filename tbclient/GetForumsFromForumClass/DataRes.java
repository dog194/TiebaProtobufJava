package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final List<ForumSpaceForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ForumSpaceForumInfo> forum_info;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;

    public static final class Builder extends Message.Builder<DataRes> {
        public List<ForumSpaceForumInfo> forum_info;
        public Integer has_more;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.forum_info = Message.copyOf(dataRes.forum_info);
            this.has_more = dataRes.has_more;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ForumSpaceForumInfo> list = builder.forum_info;
            if (list == null) {
                this.forum_info = DEFAULT_FORUM_INFO;
            } else {
                this.forum_info = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num;
                return;
            }
        }
        this.forum_info = Message.immutableCopyOf(builder.forum_info);
        this.has_more = builder.has_more;
    }
}