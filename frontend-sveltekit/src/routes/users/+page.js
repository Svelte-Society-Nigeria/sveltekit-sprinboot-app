 export const load = async (loadEvent) => {
    const { fetch } = loadEvent;
    const title = 'List of Registered Users'
    const response = await fetch('http://localhost:8080/api/users');
    const users = await response.json()
    return{
        title,
        users
    };
 
 } 