const MyDetailsCompo=(props)=>{
    const{name,contact,gender,address}=props;
return (

    <div>
        <h3>Name :{name} Contact:{contact} Gender:{gender} Address:{address}</h3>
    </div>
)
}
export default MyDetailsCompo;