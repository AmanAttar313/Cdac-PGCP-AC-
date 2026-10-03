const Greeting=()=>{

        const greeting=()=>{
            window.alert("nice to meet you");
        
        } 
        const welcome=()=>{
            window.alert("Welcome")
        }  
        return(
            <div>
                <h2>Gretting Compomnent</h2>
                <button type="button" onClick={()=>greeting()}>click me</button>
                <hr/>
                <h1 onMouseOver={()=>welcome()}>HOVER ME</h1>
            </div>
        )

}
export default Greeting;