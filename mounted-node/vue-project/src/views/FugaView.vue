<script>
import axios from 'axios';
export default {
    data() {
        return {
            record: {
                name: ''
            }
        }
    },
    mounted() {
        axios.get('http://localhost:8080/demo/api/fuga').then(response => this.record = response.data);
    }
}
</script>
<template>
    <div>{{ record.name }}</div>
</template>