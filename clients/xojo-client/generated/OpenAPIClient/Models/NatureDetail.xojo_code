#tag Class
Protected Class NatureDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The stat decreased by 10% in Pokémon with this nature.
		#tag EndNote
		decreased_stat As OpenAPIClient.Models.StatSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The stat increased by 10% in Pokémon with this nature.
		#tag EndNote
		increased_stat As OpenAPIClient.Models.StatSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The flavor liked by Pokémon with this nature.
		#tag EndNote
		likes_flavor As OpenAPIClient.Models.BerryFlavorSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The flavor hated by Pokémon with this nature.
		#tag EndNote
		hates_flavor As OpenAPIClient.Models.BerryFlavorSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of Pokéathlon stats this nature effects and how much it effects them.
		#tag EndNote
		pokeathlon_stat_changes() As OpenAPIClient.Models.NaturePokeathlonStat
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
		#tag EndNote
		move_battle_style_preferences() As OpenAPIClient.Models.NatureBattleStylePreference
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.NatureName
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="decreased_stat"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="increased_stat"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="likes_flavor"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BerryFlavorSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hates_flavor"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BerryFlavorSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokeathlon_stat_changes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NaturePokeathlonStat"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="move_battle_style_preferences"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NatureBattleStylePreference"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NatureName"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


