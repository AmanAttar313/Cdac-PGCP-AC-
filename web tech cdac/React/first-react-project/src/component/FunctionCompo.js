const FunCompo=(props)=>{
    const {fname,lname,pin}=props;    {/*  destructing props */}
 return(
      <div>
            
            <h3>FUNCTION COMPONENT</h3>
            <p>Hello i am FUnction compo</p>
            {/* <h2>Fname: {props.fname} lname:{props.lname} Pin:{props.pin}</h2> */}
            {/* OR */}
            <h2>Fname: {fname} lname:{lname} Pin:{pin}</h2>

            
            </div>
 ) 
};
export default FunCompo;