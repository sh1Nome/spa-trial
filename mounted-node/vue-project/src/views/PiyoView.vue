<script>
import axios from 'axios';
export default {
    data() {
        return {
            record: {
                name: '',
                greeting: ''
            }
        }
    },
    mounted() {
        axios.post('http://localhost:8080/demo/api/piyo', {
            greeting: 'Hello'
        }).then(response => this.record = response.data);
    }
}
</script>
<template>
    <div>{{ record.name }}</div>
    <div>{{ record.greeting }}</div>
</template>