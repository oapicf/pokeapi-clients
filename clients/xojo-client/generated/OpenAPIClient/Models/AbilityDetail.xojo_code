#tag Class
Protected Class AbilityDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		is_main_series As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		names() As OpenAPIClient.Models.AbilityName
	#tag EndProperty


	#tag Property, Flags = &h0
		effect_entries() As OpenAPIClient.Models.AbilityEffectText
	#tag EndProperty


	#tag Property, Flags = &h0
		effect_changes() As OpenAPIClient.Models.AbilityChange
	#tag EndProperty


	#tag Property, Flags = &h0
		flavor_text_entries() As OpenAPIClient.Models.AbilityFlavorText
	#tag EndProperty


	#tag Property, Flags = &h0
		pokemon() As OpenAPIClient.Models.AbilityDetailPokemonInner
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
			Name="is_main_series"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="generation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GenerationSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effect_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityEffectText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effect_changes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityChange"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flavor_text_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityFlavorText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityDetailPokemonInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


