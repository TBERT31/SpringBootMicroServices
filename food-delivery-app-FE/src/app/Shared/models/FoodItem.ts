export interface FoodItem {
    id?: number;
    itemName?: string;
    itemDescription?: string;
    isVeg?: boolean;
    price?: number;
    restaurantId?: number | null;
    quantity: number;
}

