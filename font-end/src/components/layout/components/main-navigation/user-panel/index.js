import React from "react";
import "./css/user-panel.css";

export default class UserPanel extends React.Component {

    render() {
        return (
        <div class="user-panel">
            <div class="pull-left image">
                <img src="http://thuvienanhdep.net/wp-content/uploads/2015/10/nhung-hinh-anh-girl-xinh-dang-yeu-va-quyen-ru-nhat-viet-nam-4.jpg" class="img-circle" alt="User Image" />
            </div>
            <div class="pull-left info">
                <p>Alexander Pierce akfhadskj</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        )
    }
}