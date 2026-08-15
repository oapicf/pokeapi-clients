//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.g.dart';

/// EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender implements Built<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender._();

  factory EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender([void updates(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderBuilder b)]) = _$EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender> get serializer => _$EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderSerializer();
}

class _$EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderSerializer implements PrimitiveSerializer<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender> {
  @override
  final Iterable<Type> types = const [EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender, _$EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender];

  @override
  final String wireName = r'EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

