package tbclient.Personal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.ForumDynamic;
import tbclient.ThreadInfo;
import tbclient.User;

/* loaded from: classes4.dex */
public final class DataRes extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ForumDynamic> concerned_forum_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<DynamicInfo> dynamic_list;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_more;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 1)
    public final User user;

    @ProtoField(tag = 7)
    public final UserGodInfo user_god_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> video_page;

    @ProtoField(tag = 8)
    public final DealWindow window;
    public static final List<ThreadInfo> DEFAULT_VIDEO_PAGE = Collections.emptyList();
    public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST = Collections.emptyList();
    public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_HAS_MORE = 0;

    public static final class Builder extends Message.Builder<DataRes> {
        public List<ForumDynamic> concerned_forum_list;
        public List<DynamicInfo> dynamic_list;
        public Integer has_more;
        public Integer pn;
        public User user;
        public UserGodInfo user_god_info;
        public List<ThreadInfo> video_page;
        public DealWindow window;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.user = dataRes.user;
            this.video_page = Message.copyOf(dataRes.video_page);
            this.dynamic_list = Message.copyOf(dataRes.dynamic_list);
            this.concerned_forum_list = Message.copyOf(dataRes.concerned_forum_list);
            this.pn = dataRes.pn;
            this.has_more = dataRes.has_more;
            this.user_god_info = dataRes.user_god_info;
            this.window = dataRes.window;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            List<ThreadInfo> list = builder.video_page;
            if (list == null) {
                this.video_page = DEFAULT_VIDEO_PAGE;
            } else {
                this.video_page = Message.immutableCopyOf(list);
            }
            List<DynamicInfo> list2 = builder.dynamic_list;
            if (list2 == null) {
                this.dynamic_list = DEFAULT_DYNAMIC_LIST;
            } else {
                this.dynamic_list = Message.immutableCopyOf(list2);
            }
            List<ForumDynamic> list3 = builder.concerned_forum_list;
            if (list3 == null) {
                this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
            } else {
                this.concerned_forum_list = Message.immutableCopyOf(list3);
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.has_more;
            if (num2 == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num2;
            }
            this.user_god_info = builder.user_god_info;
            this.window = builder.window;
            return;
        }
        this.user = builder.user;
        this.video_page = Message.immutableCopyOf(builder.video_page);
        this.dynamic_list = Message.immutableCopyOf(builder.dynamic_list);
        this.concerned_forum_list = Message.immutableCopyOf(builder.concerned_forum_list);
        this.pn = builder.pn;
        this.has_more = builder.has_more;
        this.user_god_info = builder.user_god_info;
        this.window = builder.window;
    }
}