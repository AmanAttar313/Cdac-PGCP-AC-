import React, { Component } from "react";

class MyfrindDetails extends Component {
    render() {
        const { name, contact, gender, address } = this.props;
        return (
            <div>
                <h3>Name :{name} Contact:{contact} Gender:{gender} Address:{address}</h3>
            </div>
        )
    };
};
export default MyfrindDetails;