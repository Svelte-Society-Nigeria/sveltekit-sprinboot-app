<script>
    export let data;
    const users = data.users
</script>

<h1>{data.title} </h1>
{#each users as user}
    <div>
        <h2>
            {user.id}
        </h2>
        <p>
            {user.email}
        </p>
        <p>
                        {user.username}

    </div>
{/each}